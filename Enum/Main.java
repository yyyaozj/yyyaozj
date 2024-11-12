package Enum;

public class Main {
    public static void test(WeekDay day){
        switch (day){
            case Monday :
                System.out.println("星期一");
                break;
            case Tuesday:
                System.out.println("星期二");
                break;
            case Wednesday:
                System.out.println("星期三");
                break;
            case Thursday:
                System.out.println("星期四");
                break;
            case Friday:
                System.out.println("星期五");
                break;
            case Saturday:
                System.out.println("星期六");
                break;
            case Sunday:
                System.out.println("星期天");
                break;
        }
    }

    public static void main(String[] args) {
        int num=1;
        double num2=1.11;
        WeekDay day = WeekDay.Tuesday;
        test(day);

    }
}
