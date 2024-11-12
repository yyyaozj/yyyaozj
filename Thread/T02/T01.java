package Thread.T02;

public class T01 {
    public static void main(String[] args) {
        //继承Thread类创造线程
        //创造线程对象
        System.out.println(Thread.currentThread().getName()+"==============");
        MyThread t1 = new MyThread();
        //调度start方法启动线程
        t1.start();
    }
}
