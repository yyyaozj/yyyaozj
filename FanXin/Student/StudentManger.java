package FanXin.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManger {
    List<Student> list = new ArrayList<Student>();


    Student s=new Student("yy",1,1);
public void add(Student s){
    list.add(s);
}

    public  boolean addStudent(Student stu){
        boolean flag = list.add(stu);
        return flag;
    }

    public  void  printAll(){
        for (Student stu:list){
            System.out.println("姓名\t\t"+"年龄\t\t"+"学号\t\t");
            System.out.println(stu.getName()+"\t\t"+stu.getAge()+"\t\t"+stu.getNum());

        }
    }

}
