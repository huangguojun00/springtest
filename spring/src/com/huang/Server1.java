package com.huang;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Huang Guojun
 * @Date 2018/10/26
 * @Discription
 */
public class Server1 {
    public static void main(String[] args) throws IOException {
        // 在20006端口监听客户端的请求的tcp连接
        ServerSocket serverSocket = new ServerSocket(20006);
        Socket client = null ;
        boolean f = true;
        while (f){
            // 等待客户端的连接，如果没有获取连接
            client = serverSocket.accept();
            System.out.println("与客户端连接成功！");
            new Thread(new ServerThread(client)).start();
        }
        serverSocket.close();
    }
}
