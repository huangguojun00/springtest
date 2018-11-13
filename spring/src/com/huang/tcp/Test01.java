package com.huang.tcp;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author Huang Guojun
 * @Date 2018/10/29
 * @Discription
 */
public class Test01 {
    public static synchronized void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Test test = new Test();
            System.out.println(test);
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    test.sync();
                }
            });
            thread.start();

        }
    }

static class Test {
    public void sync() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // 无返回值的业务代码
                System.out.println("我是执行的代码，如果我成功了就可以嘿嘿嘿");
            }
        });
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Object> submit = executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                // 有返回值的业务代码
                System.out.println("我是有返回值的代码");
                String s = "我是返回值";
                return s;
            }
        });
        boolean done = submit.isDone();
        // 针对执行情况进行相应，也可以单独写一个轮询方法，进行业务的轮询。
        if (done) {
            System.out.println("爸爸我知道他干完了");
        }
    }
}
}
