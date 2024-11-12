package FanXin.Text02;

import java.util.ArrayList;
import java.util.List;

public class T02 {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();
        Book b1 = new Book("哈哈哈","李华",30);
        list.add(b1);
        Book b3 = new Book("33333","甲",30);
        list.add(b3);
        Book b4 = new Book("444444","乙",30);
        list.add(b4);
        Book b2 = new Book("啦啦啦啦啦","王华",50);
        list.add(0,b2);

        for (Book item:list){
            System.out.println(item);
        }


    }
}
