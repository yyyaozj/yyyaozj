package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T01 {
    public static double Chu(int num1, int num2){
        int result;
        result= num1/num2;
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        //Chu a=new Chu();

        try{
         Chu(8,4);

        Scanner input=new Scanner(System.in);
        System.out.println("输入第一个数：");
        int num = input.nextInt();
        System.out.println("输入第二个数：");
        int num1 = input.nextInt();
        double resulut;
        resulut=num/num1;
            System.out.println("结果"+resulut);

    }
        catch (InputMismatchException exx) {
            System.out.println("不能输入数字以外的东西");
        }

        catch (Exception ex){
            System.out.println("除数不能为零");
        }

        finally{
            System.out.println("程序结束");
    }

}}
