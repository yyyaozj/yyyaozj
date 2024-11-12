package Implements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("亲输入两个数");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        Calcularor[] calcularors={new Add(),new Sub(),new Chu(),new Mul()};
        for (Calcularor calcu:calcularors){
            double result = calcu.calc(a,b);
            System.out.println(result);
        }

    }
}
