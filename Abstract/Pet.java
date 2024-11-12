package Abstract;

public abstract class Pet {
    String name;
    int age;

    public Pet(String name, int age) {
        this.age =age;
        this.name=name;
    }

    public void Pet(){}


public void show(){
    System.out.println("宠物是"+this.name+"年龄是"+age);
}
    public abstract void work();
}







/*
public class T06.Pet { // 定义一个名为 T06.Pet 的类

    private String name; // 声明一个私有字符串变量 name，用于存储宠物的名字
    private int age; // 声明一个私有整数变量 age，用于存储宠物的年龄

    // 构造函数，接受两个参数：name 和 age
    public T06.Pet(String name, int age) {
        this.name = name; // 将传入的 name 参数赋值给类的 name 变量  <-----
        this.age = age; // 将传入的 age 参数赋值给类的 age 变量
    }

    // 其他方法和属性可以在这里定义
}
--------------------------------------------------------



 */