package Basic_01.NetworkCode.Network.UDP;

/*
    UDP接收数据：
    步骤：
        1. 创建接收端Socket对象(DatagramSocket)
        2. 创建一个数据包，来接收数据
        3. 调用DatagramSocket对象的方法接收数据
        4. 解析数据包，并在控制台显示
        5. 关闭接收端
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //1. 创建接收端对象，并指定端口
        DatagramSocket ds = new DatagramSocket(10086);

        //创建数据包，来接收发送端发送的数据
        byte[] bys = new byte[1024];

        //调用DatagramSocket对象的方法来接收数据
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        //接收数据
        ds.receive(dp);

        //控制台显示
        System.out.println("数据是: " + new String(dp.getData(), 0, dp.getLength()));

        //关闭接收端
        ds.close();
    }
}
