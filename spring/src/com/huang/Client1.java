package com.huang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * @Author Huang Guojun
 * @Date 2018/10/26
 * @Discription
 */
public class Client1 {
    public static void main(String[] args) throws IOException {
        // 客户端请求与本机在20006端口建立tcp连接
        Socket client = new Socket("127.0.0.1", 20006);
        client.setSoTimeout(10000);
        // 获取键盘上输入
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // 获取socket的输出流，用来发送数据到服务端
        PrintStream out = new PrintStream(client.getOutputStream());
        // 获取socket的输入流，用来接收从服务端发来的数据
        BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
        boolean flag = true;
        if (flag) {
            System.out.print("输入信息 :");
            String str = input.readLine();
            // 发送数据到服务端
            out.println(str);
            if ("bye".equals(str)) {
                flag = false;
            } else {
                // 从服务端接收数据有个时间限制，超过了这个时间，便会抛出异常
                try {
                    String echo = buf.readLine();
                    System.out.println(echo);
                } catch (SocketTimeoutException e) {
                    System.out.println("Time out , No response");
                }

            }

            if (client == null) {
                // 如果构造函数建立了连接，则关闭套接字，如果没有建立起连接，自然不用关闭
                client.close();
            }
        }


    }
}
