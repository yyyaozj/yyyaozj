package Thread.Chi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class T01 {
    public static void main(String[] args) {
        //创建线程池  管理n个线程
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //创建3个任务
        //看哪个任务线抢到CPU的执行权
        Runnable t1 = new MyTask("t1");
        Runnable t2 = new MyTask("t2");
        Runnable t3 = new MyTask("t3");

        //提交任务到线程池
        pool.submit(t1);
        pool.submit(t2);
        pool.submit(t3);

        //关闭线程池
        pool.shutdown();
    }
}
