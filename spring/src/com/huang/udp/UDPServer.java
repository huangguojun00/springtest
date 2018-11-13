package com.huang.udp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


/**
 * @Author Huang Guojun
 * @Date 2018/10/29
 * @Discription
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {
        String str_send = "Hello UDPClient";
        byte[] bytes = new byte[1024];
        // 服务端在3000端口监听接收到的数据
        DatagramSocket datagramSocket = new DatagramSocket(3333);
        // 接收从客户端发来的数据
        DatagramPacket dp_receive = new DatagramPacket(bytes, 1024);
        System.out.println("server is on，waiting for client to send data......");
        boolean f = true;
        while (f) {
            datagramSocket.receive(dp_receive);
//            System.out.println("server received data from client：");
            String str_receive = new String(dp_receive.getData(), 0, dp_receive.getLength()) +
                    " from " + dp_receive.getAddress().getHostAddress() + ":" + dp_receive.getPort();
            System.out.println(str_receive);
            DatagramPacket datagramPacket = new DatagramPacket(str_send.getBytes(), str_send.length(), dp_receive.getAddress(),9999);
            datagramSocket.send(datagramPacket);
            dp_receive.setLength(1024);
            f= false;
        }
        datagramSocket.close();
    }
}
