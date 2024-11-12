package IOSterm.Book;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class T02 {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        Book b1 = new Book("书1",20,"甲");
        Book b2 = new Book("书2",60,"甲222");
        list.add(b1);
        list.add(b2);
        //序列化一个文件
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\86136\\Desktop\\JavaIO练习\\读书.bin.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            System.out.println("序列化成功");

        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        }catch (IOException e){
            e.getStackTrace();
        }
        try {
            fos.close();
        } catch (IOException e) {
            e.getStackTrace();
        }

    }


}
