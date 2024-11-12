package Thread.Chi;

public class MyTask implements Runnable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

public MyTask(){}
    public  MyTask(String name){
    this.name=name;
    }
    @Override
    public void run() {
        System.out.println(name+"运行中");
    }
}
