package IOSterm.T01;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\86136\\Desktop\\JavaIO练习\\1.txt");
        if (file.exists()){
            //文件存在；继续证明文件类型
            if (file.isFile()){
                System.out.println("相对路径"+file.getPath());
                System.out.println("绝对路径"+file.getAbsolutePath());
                System.out.println("文件名称"+file.getName());
                System.out.println("文件大小"+file.length()+"字节");
            }
            if(file.isDirectory()){
                System.out.println("是目录");
            }

            } else {
            System.out.println("文件不存在");
        }
    }
}
