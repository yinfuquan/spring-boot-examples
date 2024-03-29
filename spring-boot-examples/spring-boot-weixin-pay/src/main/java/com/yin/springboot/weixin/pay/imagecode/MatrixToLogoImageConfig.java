package com.yin.springboot.weixin.pay.imagecode;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/16
 * Time: 23:31
 * To change this template use File | Settings | File Templates.
 */
public class MatrixToLogoImageConfig {
    public static final Color DEFAULT_BORDERCOLOR;
    public static final int DEFAULT_BORDER = 2;
    public static final int DEFAULT_LOGOPART = 5;
    private final int border;
    private final Color borderColor;
    private final int logoPart;

    public MatrixToLogoImageConfig() {
        this(DEFAULT_BORDERCOLOR, 5);
    }

    public MatrixToLogoImageConfig(Color borderColor, int logoPart) {
        this.border = 2;
        this.borderColor = borderColor;
        this.logoPart = logoPart;
    }

    public Color getBorderColor() {
        return this.borderColor;
    }

    public int getBorder() {
        this.getClass();
        return 2;
    }

    public int getLogoPart() {
        return this.logoPart;
    }

    static {
        DEFAULT_BORDERCOLOR = Color.RED;
    }
}
