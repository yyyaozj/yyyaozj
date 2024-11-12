package Enum2;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",Gender.Female);
        System.out.println(s1.name+"\t\t"+s1.sex);
    }
}
