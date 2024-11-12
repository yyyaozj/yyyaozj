package Myself;

public class Person {



    public String getName() {
    return name;
}

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    private String name ;
    private String pwd ;



    public  void  Person(){}

    public void Person(String name,String pwd){
        this.name=name;
        this.pwd = pwd;

}}
