package Basic_01.NetworkCode.Network.TCP;

/*
    TCP接收端
 */

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceDemo1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        Socket s = ss.accept();

        InputStream is = s.getInputStream();

        byte[] bys = new byte[1024];

        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("数据是:" + data);

        s.close();
        ss.close();
    }
}
