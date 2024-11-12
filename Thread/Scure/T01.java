package Thread.Scure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class T01 {


    // 构造函数
    public void printList()  {
        ArrayList<String> list = new ArrayList<String>();
        list.add("java"); // 在构造函数中添加元素
        list.add("PHP");

        Vector<String> vector = new Vector<>();
        vector.add("java2");
        vector.add("php02");

        HashMap<String,String> map = new HashMap<>();
        map.put("甲","01");
        map.put("乙","02");

        Hashtable<String,String> table=new Hashtable<>();
        table.put("甲","01");
        table.put("乙","02");

        for (String item : list) {
            System.out.println(item);
        }
    }






    public static void main(String[] args) {
        T01 t01 = new T01(); // 创建对象，调用构造函数
        t01.printList(); // 打印列表内容
    }
}










//    public boolean add(E e){
//        ensureCapa
   // }


