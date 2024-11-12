package Thread.T04;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1;i<=20;i++){
            System.out.println(Thread.currentThread().getName()+"线程111");
            System.out.println("A");
            System.out.println("B");
            System.out.println("C");
            System.out.println("D");
            System.out.println("");
        }
    }
}
