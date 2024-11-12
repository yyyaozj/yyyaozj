//package Socket.T02;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.ObjectInputStream;
//import java.io.OutputStream;
//import java.net.Socket;
//
//public class MyThread extends Thread{
//    Socket socket = null;
//    public MyThread(){
//
//    }
//    public MyThread(Socket socket){
//        this.socket = socket;
//
//        public void run(){
//
//            InputStream is = null;
//            OutputStream os = null;
//            ObjectInputStream ois = null;
//
//            try {
//            is = socket.getInputStream();
//            os= socket.getOutputStream();
//            ois = new ObjectInputStream(is);
//              try {
//                  UserInfo info = null;
//                  try {
//                      info = (UserInfo) ois.readObject();
//                      System.out.println("接收到的消息为" + "\t" + info.getName() + "\t" + info.getPwd());
//
//                  } catch (ClassNotFoundException e) {
//                      throw new RuntimeException(e);
//                  }
//
//
//
//
//            } catch (IOException e) {
//e.printStackTrace();
//             }finally {
//                try {
//                ois.close();
//                os.close();
//                is.close();
//                } catch (IOException e) {
//                   e.printStackTrace();
//                }
//            }
//
//        }
//    }
//}
