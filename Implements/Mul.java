package Implements;

public class Mul implements  Calcularor{

    @Override
    public double calc(int num1, int num2) {
        System.out.println("乘法");
        return num1*num2;
    }
}
