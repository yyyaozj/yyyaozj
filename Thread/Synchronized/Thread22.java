package Thread.Synchronized;

public class Thread22 implements Runnable{


    @Override
    public void run() {
        //同步程序在执行完程序再执行另一个程序
        synchronized (this) {
        for (int i=1; i<=20;i++){
            System.out.println(Thread.currentThread().getName()+"线程222");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("");
        }
    }
}}
