package JiHe_LinkedList;

import JiHe_ArrayList.Book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //定义一个l链表保存多本图书
        LinkedList list=new LinkedList();
        Book b1 =new Book("英语四级","李华",50);
        Book b2 =new Book("英语3级","甲",20);
        Book b3 =new Book("英语2级","乙",10);
        list.addFirst(b3);
        list.addLast(b1);
        list.addLast(b2);

        list.remove(0);
        list.removeLast();
        //输出图书
        for (int i=0;i< list.size();i++)
        {
            Book b = (Book) list.get(i);
            System.out.println(b);
        }




}}
