package IOSterm.Picture;

import java.io.*;

public class T01 {
    public static void main(String[] args) throws IOException {
        //使用二进制读写，DAtaInputStream  DataOutputStream 实现文件的复制
        FileInputStream fis = null;
        FileOutputStream fos = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;
        try {
            //y源文件路径
            fis = new FileInputStream("C:\\Users\\86136\\Desktop\\JavaIO练习\\图片.png");
            //目标文件路径
            fos = new FileOutputStream("C:\\Users\\86136\\Desktop\\JavaIO练习\\图片2.png");
            dis = new DataInputStream(fis);
            dos = new DataOutputStream(fos);
            //边读数据，边写入数据
            int data;
            while((data = dis.read())!=-1){
                //没有到达流的末尾
                dos.write(data);
            }
            System.out.println("复制成功");

        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        }catch (IOException e){
            e.getStackTrace();
        }



        finally {
            try {
                dos.close();
                dis.close();
                fos.close();
                fis.close();
            } catch (Exception e) {
                e.getStackTrace();
            }

        }
    }
}
