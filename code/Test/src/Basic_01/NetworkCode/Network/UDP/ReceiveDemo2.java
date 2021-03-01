package Basic_01.NetworkCode.Network.UDP;

/*
    UDP通讯练习：接收端
        因为接收端不知道发送端什么时候停止发送，故采用死循环接收
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10088);

        while (true) {
            byte[] bys = new byte[1024];

            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            ds.receive(dp);

            System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
        }
//        ds.close();

    }
}
