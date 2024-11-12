package Thread.T01;

public class T01 {
    public static void main(String[] args) {
        //打印主线程名称
        Thread thread=Thread.currentThread();
        System.out.println("主线程名称是"+thread.getName());
        //设置主线程名称
        thread.setName("java____主线程");
        System.out.println("现在的名称是"+thread.getName());
    }
}
