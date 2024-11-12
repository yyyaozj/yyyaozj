package JiHe_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

   //定义一个集合保存多本图书
    List list=new ArrayList();
    Book b1=new Book("假如有三天光明","海伦凯勒",36);
    Book b2=new Book("摆渡人","杰西",55);
    list.add(b1);
    list.add(b2);
    //插入图书
    Book b3 = new Book("Java","jack",66)  ;
    list.add(1,b3);
    //删除图书
       // list.remove(b1);
        for (int i=0;i< list.size();i++){
            //强制转换
            Book b = (Book) list.get(i);
            System.out.println(b);
        }


}
}