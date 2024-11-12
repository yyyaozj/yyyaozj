package IOSterm.Write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        FileWriter writer=null;
        try {


            writer=new FileWriter("C:\\Users\\86136\\Desktop\\JavaIO练习\\3.txt");
            String s ="hahahhaha";
            writer.write(s);
            writer.flush();
            System.out.println("写入成功");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
