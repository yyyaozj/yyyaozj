package Thread.T03;

public class T03 {
    public static void main(String[] args) {
        MyRunnable r1=new MyRunnable();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
