package IOSterm.Write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class T01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\86136\\Desktop\\JavaIO练习\\2.txt");
            //写入操作
            String s = "新添加的东西";

            //将字符串转成字节数组
            byte[] bytes = s.getBytes();
            try {
                fos.write(bytes);
                System.out.println("写入成功");
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        }
        finally {try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
            {
        }

    }
}}
