package FanXin.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {


        StudentManger mgr=new StudentManger();

        Student s1=new Student("甲",20,01);
        Student s2=new Student("甲",20,01);
        Student s3=new Student("甲",20,01);


        Scanner input=new Scanner(System.in);
        String yesOrNo = "y";
        while(yesOrNo.equals("y")){
            System.out.println("请输入学号");
            int num = input.nextInt();
            System.out.println("请输入姓名");
            String name = input.next();
            System.out.println("请输入年龄");
            int age = input.nextInt();

            Student stu=new Student(name,age,num);
            boolean flag = mgr.addStudent(stu);
            if(flag){
                System.out.println("添加成功");
                System.out.println("是否继续添加yOrn");
                yesOrNo=input.next();

            }else {
                System.out.println("添加失败");}
        } mgr.printAll();
    }

}
