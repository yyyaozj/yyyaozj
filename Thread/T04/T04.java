package Thread.T04;



public class T04 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread t1 = new Thread(myThread);
        t1.start();

        Thread22 ww =new Thread22();
        Thread t2 = new Thread(ww);
        t2.start();

    }
}
