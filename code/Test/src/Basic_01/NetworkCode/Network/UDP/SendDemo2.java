package Basic_01.NetworkCode.Network.UDP;

/*
    UDP通讯练习：发送端
        数据来自于键盘录入，直到输入的数据是886，发送数据结束
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo2 {
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象（DatagramSocket）
        DatagramSocket ds = new DatagramSocket();

        //封装键盘输入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }

            byte[] bys = line.getBytes();

            DatagramPacket pd = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.5.15"), 10088);

            ds.send(pd);
        }
        ds.close();
    }
}
