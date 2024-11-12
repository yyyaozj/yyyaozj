package IOSterm.Write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class T02 {
    public static void main(String[] args) {
        Writer writer = null;
        BufferedWriter bw = null;

        try {

            writer = new FileWriter("C:\\Users\\86136\\Desktop\\JavaIO练习\\7.txt");
            bw = new BufferedWriter(writer);
            bw.write("ppppppppppppp");
            System.out.println("写入成功");

        } catch (IOException e) {
            e.getStackTrace();
        }finally {
            try {
                bw.close();
                writer.close();
            } catch (IOException e) {

                e.getStackTrace();
            }

        }
    }
}
