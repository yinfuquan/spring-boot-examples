package com.yin.springboot.common.result;

/**
 * 封装API的错误码
 * Created by macro on 2019/4/19.
 */
public interface IResultCode {
    long getCode();

    String getMessage();
}
