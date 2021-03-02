package Basic_01.NetworkCode.Network.TCP;

/*
    客户端：发送数据，接受服务器反馈
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket
        Socket s = new Socket("192.168.5.18", 10086);

        //获取输出流
        OutputStream os = s.getOutputStream();

        //写数据
        os.write("Hello,TCP!".getBytes());

        //接受服务器数据
        InputStream is = s.getInputStream();

        byte[] bys = new byte[1024];

        System.out.println("客户端" + new String(bys, 0, is.read(bys)));

        s.close();
    }
}
