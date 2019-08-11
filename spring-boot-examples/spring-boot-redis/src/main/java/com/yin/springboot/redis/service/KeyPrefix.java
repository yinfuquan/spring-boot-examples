package com.yin.springboot.redis.service;

public interface KeyPrefix {

    public int expireSeconds() ;

    public String getPrefix() ;

}
