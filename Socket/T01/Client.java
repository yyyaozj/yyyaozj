package Socket.T01;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        //创建一个Socket 和服务端Socket 进行通话
        Socket socket = null;
        InputStream is = null;
        OutputStream os = null;
        System.out.println("亲输入内容");
        Scanner input = new Scanner(System.in);
        BufferedReader br = null;
        //192.168.1.100
        try {
            socket = new Socket("localhost",50000);
            is = socket.getInputStream();
            os = socket.getOutputStream();
            String msg = input.next();
            //向服务端发送信息
            os.write(msg.getBytes());
            socket.shutdownOutput();
            //接收服务端发送的信息
            br = new BufferedReader(new InputStreamReader(is));
            msg = "";
            while((msg = br.readLine())!=null){
                System.out.println("服务端的响应是"+msg);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }finally {
            try {

                br.close();
                os.close();
                is.close();
                socket.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }
}
