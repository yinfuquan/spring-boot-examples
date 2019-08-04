package com.yin.springboot.thread.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/23
 * Time: 0:04
 * To change this template use File | Settings | File Templates.
 */
public class FutureTaskDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> futureTask=new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                return "ok";
            }
        });


        Thread thread=new Thread(futureTask);

        thread.start();

        String future=futureTask.get();

        System.out.println(future);
    }


}
