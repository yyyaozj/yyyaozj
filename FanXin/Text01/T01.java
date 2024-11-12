package FanXin.Text01;

import java.util.*;

public class T01 {
    public static void main(String[] args) {
        //HashMap  双列集合  key +  value
        Map map =new HashMap();
        map.put ("ABC","中国农业银行");
        map.put ("CBC","中国建设银行");
        map.put ("ICBC","中国工商银行");
        //、、Key获取value
        String value = (String) map.get("CBC");
        System.out.println(value);
        System.out.println("-----------------------------");
        //获取所有key的集合
        Set set = map.keySet();
        System.out.println(set);
        System.out.println("==================================");

        //获取所有value
        Collection values = map.values();
        System.out.println(values);
        System.out.println("---------------------------");

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println("---------------------------");
        boolean result = map.containsKey("ABC");
        if (result){
            System.out.println("存在");
        }else{
            System.out.println("不存在");

    }
}}

