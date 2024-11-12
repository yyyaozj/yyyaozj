package Socket.T02;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        OutputStream os = null;
        ObjectInputStream ois = null;
        try {
        serverSocket = new ServerSocket(50000);
        socket = serverSocket.accept();
        is = socket.getInputStream();
        os = socket.getOutputStream();
        ois = new ObjectInputStream(is);
        //接收信息
            UserInfo info =(UserInfo) ois.readObject();
            System.out.println("接收到的信息为："+info.getName()+"\t"+info.getPwd());
            socket.shutdownInput();
            String msg = "这里是服务器返回的信息";
            os.write(msg.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } catch ( Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
            ois.close();
            os.close();
            is.close();
            socket.close();
            serverSocket.close();
            } catch (IOException e) {
             e.printStackTrace();
            }
        }
    }
}
