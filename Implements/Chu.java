package Implements;

public class Chu implements Calcularor{
    @Override
    public double calc(int num1, int num2) {
        System.out.println("除法");
        if (num2!=0){
        return num1/num2;
    }else {return  0;
    }
}}
