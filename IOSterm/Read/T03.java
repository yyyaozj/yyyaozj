package IOSterm.Read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class T03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            try {
                fis = new FileInputStream("C:\\Users\\86136\\Desktop\\JavaIO练习\\2.txt");
                byte[] bytes = new byte[1024];
                while ((fis.available())!=0){
                    int data = fis.read(bytes);
                    String temp = new String(bytes,0,data);
                    System.out.println(temp);
                }
            } catch (FileNotFoundException e) {
                System.out.println("文件不存在");


            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        finally{

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    }
}
