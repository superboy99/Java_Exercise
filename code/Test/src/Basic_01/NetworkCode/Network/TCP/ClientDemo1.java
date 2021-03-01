package Basic_01.NetworkCode.Network.TCP;

/*
    TCP发送数据
 */

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象（Socket）
        Socket sk = new Socket("192.168.5.15",10086);

        //创建输出流，写入数据
        OutputStream os = sk.getOutputStream();
        os.write("Hello TCP!!!".getBytes());

        sk.close();

    }
}
