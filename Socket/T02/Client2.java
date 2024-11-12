package Socket.T02;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {


        public static void main(String[] args) {

            //创建一个Socket 和服务端Socket 进行通话
            Socket socket = null;
            InputStream is = null;
            OutputStream os = null;
            ObjectOutputStream oos = null;

            BufferedReader br = null;
            System.out.println("请输入内容：");

            Scanner input = new Scanner(System.in);

            //192.168.1.100
            try {
                socket = new Socket("localhost",50000);
                is = socket.getInputStream();
                os = socket.getOutputStream();
                oos = new ObjectOutputStream(os);
                String uname = input.next();
                String upwd = input.next();
                UserInfo info = new UserInfo();
                info.setName(uname);
                info.setPwd(upwd);
                oos.writeObject(info);
                socket.shutdownOutput();
                //向服务端发送信息

                String msg = input.next();

                os.write(msg.getBytes());
                socket.shutdownOutput();
                //接收服务端发送的信息


                br = new BufferedReader(new InputStreamReader(is));
                msg = "";
                while((msg = br.readLine())!=null){
                    System.out.println("服务端的响应是"+msg);
                }
            } catch (
                    IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    br.close();
                    oos.close();
                    os.close();
                    is.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
}

