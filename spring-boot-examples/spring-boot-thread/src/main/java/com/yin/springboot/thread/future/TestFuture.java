package com.yin.springboot.thread.future;

import org.springframework.cache.annotation.Cacheable;

import java.util.concurrent.Callable;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/23
 * Time: 0:18
 * To change this template use File | Settings | File Templates.
 */
public class TestFuture implements Callable<String> {
    private  String name;
    TestFuture(String name){
        this.name=name;
    }

    @Override
    public String call() throws Exception {
        return name;
    }
}
