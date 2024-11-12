package IOSterm.T02;

import java.io.File;
import java.io.IOException;

public class T02 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\86136\\Desktop\\JavaIO练习\\2.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("创建成功");

        }else{
            System.out.println("文件已经存在");
        }

    }
}
