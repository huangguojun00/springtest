package com.huang.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @Author Huang Guojun
 * @Date 2018/10/29
 * @Discription
 */
public class UDPClient {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        byte[] bytes = new byte[1024];

        DatagramSocket datagramSocket = new DatagramSocket(9999);
        InetAddress localHost = InetAddress.getLocalHost();
        // 定义用来发送数据的实例
        DatagramPacket dp_send = new DatagramPacket(s.getBytes(), s.length(), localHost, 3333);

        // 定义用来接受的数据的datagramPacket实例
        DatagramPacket dp_receive = new DatagramPacket(bytes, 1024);
        // 数据发向本地3333接口
        datagramSocket.setSoTimeout(5000);  // 设置接收数据时阻塞的最长时间
        int tries = 0; // 设置重试次数
        boolean receiveResponse = false;  // 是否接收到数据的标志位
        // 直到接收到数据，或者重发次数达到预定值，则推出循环
        while (!receiveResponse && tries < 5) {
            datagramSocket.send(dp_send);
            try {
                datagramSocket.receive(dp_receive);
                // 如果接收到的数据不是来自目标地址则抛出异常
                if (!dp_receive.getAddress().equals(localHost)) {
                    throw new IOException("Received packet from unknown source");
                }
            } catch (IOException e) {
                tries += 1;
                System.out.println("Timeout，" + (5 - tries) + "more tries");
            }
        }
        if (receiveResponse) {

            String str_Receive = new String(dp_receive.getData(), 0, dp_receive.getPort());
            System.out.println(str_Receive);
            // 由于dp_receive在接收了数据以后，在其内部消息长度值会变成实际接收的消息的字节数。
            // 这里要将dp_receive的内部消息长度重新置为1024
            dp_receive.setLength(1024);
        } else {
            System.out.println("No response -- give up.");
        }
        datagramSocket.close();
    }
}
