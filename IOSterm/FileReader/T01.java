package IOSterm.FileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class T01 {
    public static void main(String[] args) {
        //缓冲流，读取一行
        Reader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader("C:\\Users\\86136\\Desktop\\JavaIO练习\\1.txt");
            br=new BufferedReader(reader);
            String line = br.readLine();
            while (line!=null){
                System.out.println(line);
                line = br.readLine();
            }


        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
          e.getStackTrace();
        }


        finally {
            try {
                br.close();
                reader.close();
            } catch (IOException e) {
              e.getStackTrace();
            }



        }
    }
}
