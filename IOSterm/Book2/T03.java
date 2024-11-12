package IOSterm.Book2;

import IOSterm.Book.Book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class T03 {
    public static void main(String[] args) {
        //反序列化泛型集合
        FileInputStream fis = null;
        ObjectInputStream ois = null; //二进制反序列化器

        try {
            fis = new FileInputStream("C:\\Users\\86136\\Desktop\\JavaIO练习\\读书.bin.txt");
            ois = new ObjectInputStream(fis);
            List<Book> list =(List<Book>) ois.readObject();
            for (Book book:list){
                System.out.println(book.getName()+"\t"+book.getPrice()+"\t"+book.getAuthor());
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        }catch (IOException | ClassNotFoundException e){
            e.getStackTrace();
        }finally {

            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }

    }
}
