package FanXin.Student;

public class Student {






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private String name;
    private int age;
    private int num;
    public Student(){}
    public Student(String name,int age,int num){
        this.name=name;
        this.age=age;
        this.num=num;
    }


}
