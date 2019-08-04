package com.yin.springboot.common.utils.jwt;


/**
 * 常量
 */
public class WxJwtConstants {

    public enum SignType {
        MD5, HMACSHA256
    }

    public static final String HMACSHA256 = "HMAC-SHA256";
    public static final String MD5 = "MD5";

    public static final String FIELD_SIGN = "sign";
    public static final String FIELD_SIGN_TYPE = "sign_type";


}

