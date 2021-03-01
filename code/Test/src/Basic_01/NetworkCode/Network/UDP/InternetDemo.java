package Basic_01.NetworkCode.Network.UDP;

/*
    InetAddress:此表示Internet协议（IP）地址
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetDemo {
    public static void main(String[] args) throws UnknownHostException {

        //public static InetAddress getByName(String host) 确定主机名称的IP地址；可以是主机名，可以是IP地址
        InetAddress address = InetAddress.getByName("192.168.5.15");

        //public String getHostName() 获取此IP地址的主机名
        String name = address.getHostName();

        //public String getHostAddress() 返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();

        System.out.println("主机名：" + name);
        System.out.println("IP地址：" + ip);

    }
}
