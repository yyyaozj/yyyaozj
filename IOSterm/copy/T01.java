package IOSterm.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class T01 {
    public static void main(String[] args) {
        FileInputStream fis =null;
        FileOutputStream fos = null;
        try {
        fis = new FileInputStream("C:\\Users\\86136\\Desktop\\JavaIO练习\\复制111.txt");
        fos = new FileOutputStream("C:\\Users\\86136\\Desktop\\JavaIO练习\\复制");
        byte[] bytes = new byte[1024];
        //读取数据
            while(fis.available()!=0){
                //代码执行到这里还可以读取数据
                int data = fis.read(bytes);
                //写入数据
                fos.write(bytes,0,data);
            }
            System.out.println("复制成功");

        } catch (FileNotFoundException e) {
            System.out.println("w文件不存在");
        }catch (IOException e){
            e.getStackTrace();
        }finally {

            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                System.out.println("文件不存在");
            }
        }
    }
}
