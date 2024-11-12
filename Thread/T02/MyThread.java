package Thread.T02;

public class MyThread extends  Thread{
    //线程完成什么工作，将工作存入run方法中


    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }
    }
}
