//package Myself;
//
//import java.util.Scanner;
//
//public class Login {
//    public void Login(){}
//    public void Login(String name , String pwd){
//
//        Scanner input =new Scanner(System.in );
//        System.out.println("请输入用户名");
//        String uname =input.next();
//
//        System.out.println("请输入密码");
//        Scanner input2 =new Scanner(System.in );
//        String upwd =input2.next();
//
//       if(name.equals(uname) && pwd.equals(upwd)){
//           System.out.println("登录成功");
//       }else{
//           System.out.println("登录失败重新输入");
//
//    }
//    }
//
//
//
//
//}
package Myself;

import java.util.Scanner;

public class Login {
    private String name;
    private String pwd;

    // 构造函数
    public Login(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    // 登录方法
    public void login() {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入用户名");
        String uname = input.next();

        System.out.println("请输入密码");
        String upwd = input.next();

        // 使用 equals() 方法比较字符串
        if (name.equals(uname) && pwd.equals(upwd)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败，重新输入");
        }
    }

    public static void main(String[] args) {
        // 示例：创建一个 Login 对象并调用 login 方法
        Login login = new Login("user123", "password");
        login.login();
    }
}