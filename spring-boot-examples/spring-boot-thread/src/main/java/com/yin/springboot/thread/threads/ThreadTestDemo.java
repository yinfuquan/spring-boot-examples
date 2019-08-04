package com.yin.springboot.thread.threads;

import javax.lang.model.element.VariableElement;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/7/23
 * Time: 0:24
 * To change this template use File | Settings | File Templates.
 */
public class ThreadTestDemo {

    private  static  int THREADNUM=200;
    private static int  count =0;
    private  static  int MAX=1000;

    static CountDownLatch countDownLatch= new CountDownLatch(MAX);
     static Semaphore semaphore=  new  Semaphore(THREADNUM);

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newCachedThreadPool();

        for (int i=0;i<MAX;i++){

            service.execute(()->{
                try {
                    semaphore.acquire();

                    count++;

                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });
            countDownLatch.countDown();
        }
        countDownLatch.await();
        service.shutdown();
        System.out.println(count);

    }

}
