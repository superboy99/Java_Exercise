package Basic_01.NetworkCode.Network.UDP;

/*
    UDP发生数据
    构造方法：
        DatagramSocket() 创建数据报套接并将其绑定到本机地址上的任何可用端口

        DatagramPacket(byte[] buf,int len,InetAddress add,int port) 创建数据包，发送长度为len的数据包到指定主机的指定端口

    UDP发送数据步骤：
        1. 创建发送端Socket对象(DatagramSocket)
        2. 创建数据，并打包
        3. 调用DatagramSock()对象的方法发送数据
        4. 关闭发送端
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //1. 创建发送端
        DatagramSocket ds = new DatagramSocket();

        //2. 打包数据
        byte[] bys = "王丑鬼，王丑鬼！！！！！！！！".getBytes();

        //3. 创建发送数据对象
        DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.5.15"),10086);
        ds.send(dp);

        //4. 关闭发送端
        ds.close();
    }
}
