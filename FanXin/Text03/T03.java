package FanXin.Text03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class T03 {
    public static void main(String[] args) {
        Map<String ,Book> map=new HashMap<String,Book>();
        Book b1 = new Book("CSS","甲",30);
        Book b2 =new Book("HTML","乙",56);
        map.put(b1.getName(), b1);
        map.put(b2.getName(),b2);
        //第一种方案遍历
        Set<String> keys = map.keySet();
        for(String key:keys)
        {
            Book value  = map.get(key);
            System.out.println(key+"====="+value.getAuthor());
        }
        System.out.println("--------------------------------------------------------------");
        //第二种方案遍历
        Collection<Book> values = map.values();
        for (Book value:values){
            System.out.println(value);
        }
        System.out.println("--------------------------------------------------------------");


        //第三种方案遍历
        Set<Map.Entry<String , Book>> entries= map.entrySet();
        for (Map.Entry<String , Book> entry:entries){
            System.out.println(entry.getKey()+"====="+entry.getValue().getAuthor());
        }
    }



}
