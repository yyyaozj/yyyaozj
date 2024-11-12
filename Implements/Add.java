package Implements;

public class Add implements Calcularor{

    @Override
    public double calc(int num1, int num2) {
        System.out.println("加法");
        return num1+num2;
    }
}
