package com.yin.web.exception;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/8/1
 * Time: 9:19
 * To change this template use File | Settings | File Templates.
 */
public class ServiceException extends RuntimeException {
    public ServiceException(String message){
        super(message);
    }

}
