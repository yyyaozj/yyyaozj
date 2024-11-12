package IOSterm.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        FileReader reader= null;
        StringBuffer sb = null;

        try {
            reader = new FileReader("C:\\Users\\86136\\Desktop\\JavaIO练习\\2.txt");
            char[] chars = new char[1024];
            int length = reader.read(chars);
            sb = new StringBuffer();
            while(length != -1){
                sb.append(chars,0,length);
            }


        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        }catch (IOException e){
            e.printStackTrace();

        }finally {

                try {

                    reader.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
    }
}
