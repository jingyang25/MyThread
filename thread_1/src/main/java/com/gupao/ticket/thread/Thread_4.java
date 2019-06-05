package com.gupao.ticket.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread_4 {

    public static void main(String [] args){

        //创建一个线程池
        int taskSize = 5;

        ExecutorService pool = Executors.newFixedThreadPool(taskSize);

        List<Future> list = new ArrayList<>();

        for (int i=0;i<taskSize;i++){

            Callable c = new MyCallable(i+" ");

            Future f = pool.submit(c);

            list.add(f);
        }

        //关闭线程池
        pool.shutdown();

    }


     static class  MyCallable implements Callable<Object>{

        private String taskNum;

        public MyCallable(String taskNum) {
            this.taskNum = taskNum;
        }

        @Override
        public Object call() throws Exception {

            System.out.println(taskNum+"任务启动");

            Date dateTmp = new Date();
            Thread.sleep(1000);
            Date dateTmp2 = new Date();
            long time = dateTmp.getTime()-dateTmp2.getTime();
            System.out.println(taskNum+"任务终止");
            return taskNum+"任务返回运行结果，当前时间"+time+"毫秒";
        }
    }
}
