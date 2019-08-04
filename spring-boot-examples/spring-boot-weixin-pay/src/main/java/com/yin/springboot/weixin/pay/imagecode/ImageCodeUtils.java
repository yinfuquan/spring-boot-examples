package com.yin.springboot.weixin.pay.imagecode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.Charsets;
import org.apache.http.HttpResponse;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/16
 * Time: 22:40
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
public class ImageCodeUtils {


    public  static BitMatrix createQrcodeMatrix(String content , int length){

        Map<EncodeHintType, Object> hints = new HashMap<>();
        return createQrcodeMatrix(content, length, length);

    }

    public  static BitMatrix createQrcodeMatrix(String content ){

        return createQrcodeMatrix(content, 400, 400);
    }

    public  static BitMatrix createQrcodeMatrix(String content , int length ,int height){

        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, Charsets.UTF_8.name());
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

        try {
            return (new MultiFormatWriter()).encode(content, BarcodeFormat.QR_CODE, length, height, hints);
        } catch (Exception var4) {
            log.warn("内容为：【" + content + "】的二维码生成失败！", var4);
            return null;
        }

    }

    public static void createQrcode(HttpServletResponse response, String content , int length , int height) {
        BitMatrix  bitMatrix= createQrcodeMatrix(content, length,height);

        try {
            MatrixToImageWriter.writeToStream(bitMatrix, "jpg", response.getOutputStream());
        } catch (IOException e) {
            log.warn("内容为：【" + content + "】的二维码生成失败！", e);
        }

    }



    public static byte[] createQrcodeByte(String content, int length, File logoFile) {

        if (logoFile != null && !logoFile.exists()) {
            throw new IllegalArgumentException("请提供正确的logo文件！");
        } else {
            BitMatrix qrCodeMatrix = createQrcodeMatrix(content, length);
            if (qrCodeMatrix == null) {
                return null;
            } else {
                try {
                    File file = Files.createTempFile("qrcode_", ".jpg").toFile();
                    log.debug(file.getAbsolutePath());
                    MatrixToImageWriter.writeToFile(qrCodeMatrix, "jpg", file);
                    if (logoFile != null) {
                        BufferedImage img = ImageIO.read(file);
                        overlapImage(img, "jpg", file.getAbsolutePath(), logoFile, new MatrixToLogoImageConfig());
                    }

                    return toByteArray(file);
                } catch (Exception var6) {
                    log.warn("内容为：【" + content + "】的二维码生成失败！", var6);
                    return null;
                }
            }
        }

    }


    private static void overlapImage(BufferedImage image, String format, String imagePath, File logoFile, MatrixToLogoImageConfig logoConfig) throws IOException {
        try {
            BufferedImage logo = ImageIO.read(logoFile);
            Graphics2D g = image.createGraphics();
            int width = image.getWidth() / logoConfig.getLogoPart();
            int height = image.getHeight() / logoConfig.getLogoPart();
            int x = (image.getWidth() - width) / 2;
            int y = (image.getHeight() - height) / 2;
            g.drawImage(logo, x, y, width, height, (ImageObserver)null);
            g.setStroke(new BasicStroke((float)logoConfig.getBorder()));
            g.setColor(logoConfig.getBorderColor());
            g.drawRect(x, y, width, height);
            g.dispose();
            ImageIO.write(image, format, new File(imagePath));
        } catch (Exception var11) {
            throw new IOException("二维码添加logo时发生异常！", var11);
        }
    }

    private static byte[] toByteArray(File file) {
        try {
            FileChannel fc = (new RandomAccessFile(file, "r")).getChannel();
            Throwable var2 = null;

            byte[] var5;
            try {
                MappedByteBuffer byteBuffer = fc.map(FileChannel.MapMode.READ_ONLY, 0L, fc.size()).load();
                byte[] result = new byte[(int)fc.size()];
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.get(result, 0, byteBuffer.remaining());
                }

                var5 = result;
            } catch (Throwable var15) {
                var2 = var15;
                throw var15;
            } finally {
                if (fc != null) {
                    if (var2 != null) {
                        try {
                            fc.close();
                        } catch (Throwable var14) {
                            var2.addSuppressed(var14);
                        }
                    } else {
                        fc.close();
                    }
                }

            }

            return var5;
        } catch (Exception var17) {
            log.warn("文件转换成byte[]发生异常！", var17);
            return null;
        }
    }

}
