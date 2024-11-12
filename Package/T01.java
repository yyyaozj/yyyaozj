package Package;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class T01 {
    public static void main(String[] args) {
/*
        //基本类型包装成对象类型，在泛型中使用
        Integer num = new Integer(1);
        Integer num2 = 1;
        Double num3 = 2.3;
        Double num4 = new Double(6.6);
        Character ch =new Character('h') ;
        Character cj = 'a';
        Boolean flag = true;
        //包装类型装为基本类型
        int LittleNum = num.intValue();
        double numm = num3.doubleValue();
        char hh = ch.charValue();
        boolean ff = flag.booleanValue();

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
*/

//        int num = Math.abs(-55);
//        System.out.println(num+"__________________");
//        int max = Math.max(155,2);
//        System.out.println(max+"__________________");
//        double pow = Math.pow(3,2);
//        System.out.println(pow+"+++++++++++++++++");

//            String s = "123456";
//            String s2 = "123456";
//            if(s.equals(s2)){
//                System.out.println("两个字符串相等"+"\t\t"+s+"\t\t"+s2);
//            }else{
//                System.out.println("字符串不相等");
//            }
//            String s3 = s.concat(s2);
//            System.out.println(s3);


//        String s = "我是一条鱼，但是你是一只羊";
//        int index = s.indexOf("鱼");
//        int index1 = s.indexOf("一");
//        System.out.println(index);
//        System.out.println(index1);

        //从0开始数
//        String s = "0123456  hhhhhh   ";
//        String substr = s.substring(3);
//        System.out.println(substr);
//        String Toupper = s.toUpperCase(Locale.ROOT);
//        System.out.println(Toupper);
//        String trim = s.trim();
//        System.out.println(trim);
//
//        String s = "我是一条鱼，我是一只猫，我是一只狗";
//        String repl = s.replace("是","不是");
//        System.out.println(repl);
//
//        String [] strs = s.split("，");
//        for (String item:strs){
//            System.out.println(item);
//        }

//        StringBuffer sb = new StringBuffer();
//        sb.append("01");
//        sb.append("23");
//        sb.insert(2,"a");
//        System.out.println(sb.toString());


//        Random r = new Random(5);
//        Random r1 = new Random(5);
//        int num = r.nextInt(10);
//        int num2 =  r1.nextInt(10);
//        System.out.println(num2 );
//        System.out.println(num );
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy- MM-DD HH:MM:SS");
        String result = formatter.format(date);

        System.out.println(result);

        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println("输入字符串");
        int LitterNum = 0;
        int BigNum = 0;
        int num = 0;

        for (char i : s.toCharArray()) {
            if (i >= 'a' && i <= 'z') {
                LitterNum++;
            } else if (i >= 'A' && i <= 'Z') {
                BigNum++;
            } else if (i >= '0' && i <= '9') {
                num++;
            }
        }



        System.out.println(LitterNum);
        System.out.println(BigNum);
        System.out.println(num);


    }
}
