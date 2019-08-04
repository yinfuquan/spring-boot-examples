package com.yin.springboot.redis.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Component
public class MyKeyGenerator implements KeyGenerator {

    @Override
    public Object generate(Object target, Method method, Object... params) {
        System.out.println("自定义缓存，使用第一参数作为缓存key. params = " + Arrays.toString(params));
        // 仅仅用于测试，实际不可能这么写
        return params[0] +":::" +target.toString();
    }

}