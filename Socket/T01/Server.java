package Socket.T01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        //负责监听的Socket
        ServerSocket serverSocket=null;
        Socket socket = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedReader br = null;
        try {
            serverSocket = new ServerSocket(50000);
            //负责通信的Socket
            socket = serverSocket.accept();
            //获取到输入流对象，获取数据
            is = socket.getInputStream();
            //输出流对象 ，用于发送数据
            os = socket.getOutputStream();

            br = new BufferedReader(new InputStreamReader(is));
            String msg = "";
            while ((msg = br.readLine())!=null){
                System.out.println("接收的消息为"+msg);
            }
            socket.shutdownInput();
            //给出客户端回馈信息
            msg = "这里是服务端发的信息";
            os.write(msg.getBytes());

        } catch (IOException e) {
            e.getStackTrace();
        }finally {

            try {
                br.close();
                os.close();
                is.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }
}
