package Basic_01.NetworkCode.Network.TCP;

/*
    服务器：收到消息后给出反馈
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        //接受客户端数据
        Socket s = ss.accept();

        //获取输入流
        InputStream is = s.getInputStream();

        byte[] bys = new byte[1024];

        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("服务器："+data);

        //反馈
        OutputStream os = s.getOutputStream();
        os.write("数据已经收到".getBytes());
        ss.close();
    }
}
