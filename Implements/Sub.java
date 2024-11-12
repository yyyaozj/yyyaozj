package Implements;

public class Sub implements Calcularor {
    @Override
    public double calc(int num1, int num2) {
        System.out.println("减法");
        if (num1 < num2) {
            return 0;

        } else {
            return num1 - num2;
        }
    }
}