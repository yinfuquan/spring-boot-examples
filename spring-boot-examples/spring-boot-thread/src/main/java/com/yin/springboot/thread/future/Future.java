package com.yin.springboot.thread.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/23
 * Time: 0:13
 * To change this template use File | Settings | File Templates.
 */
public class Future {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service= Executors.newCachedThreadPool();

//        java.util.concurrent.Future<String> submit = service.submit(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                return "OK";
//            }
//        });
        java.util.concurrent.Future<String> submit = service.submit(new TestFuture("thread1"));

        System.out.println(submit.get());


    }
}
