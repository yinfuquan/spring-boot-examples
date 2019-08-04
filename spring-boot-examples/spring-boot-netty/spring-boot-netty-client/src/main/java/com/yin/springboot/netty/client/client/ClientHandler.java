package com.yin.springboot.netty.client.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.util.ReferenceCountUtil;

import java.io.UnsupportedEncodingException;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/17
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
public class ClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        System.out.println("in clien read");

        ByteBuf byteBuf = (ByteBuf) msg;

        byte[] bytes = new byte[byteBuf.readableBytes()];

        byteBuf.readBytes(bytes);

        String s = null;
        try {
            s = new String(bytes, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally {
            ReferenceCountUtil.release(msg);
        }
        System.out.println(s);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws UnsupportedEncodingException {
        String reqMsg = "我是客户端 " + Thread.currentThread().getName();
        byte[] reqMsgByte = reqMsg.getBytes("UTF-8");
        ByteBuf reqByteBuf = Unpooled.buffer(reqMsgByte.length);
        /**
         * writeBytes：将指定的源数组的数据传输到缓冲区
         * 调用 ChannelHandlerContext 的 writeAndFlush 方法将消息发送给服务器
         */
        reqByteBuf.writeBytes(reqMsgByte);
        ctx.writeAndFlush(reqByteBuf);
    }
//    @Override
//    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o)  {
//
//        ByteBuf byteBuf= (ByteBuf) o;
//
//        byte[] bytes=new byte[byteBuf.readableBytes()];
//
//        byteBuf.readBytes(bytes);
//
//        String s = null;
//        try {
//            s = new String(bytes, "UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }finally {
//            ReferenceCountUtil.release(o);
//        }
//        System.out.println(s);
//
//    }
}
