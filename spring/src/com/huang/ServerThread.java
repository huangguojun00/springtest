package com.huang;

/**
 * @Author Huang Guojun
 * @Date 2018/10/26
 * @Discription
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 该类运用多线程用于服务端
 */
public class ServerThread implements Runnable {
    private Socket client = null ;

    public ServerThread(Socket client) {
        this.client = client;
    }
    @Override
    public void run() {
        // 获取Socket的输入流，用来向客户端发送数据
        try {
            PrintStream out = new PrintStream(client.getOutputStream());
            // 获取Socket的输入流，用来接收从客户端发送过来的数据
            BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
            boolean flag = true ;
            while (flag){
                // 接收从客户端发送来的数据
                String str = buf.readLine();
                if (str==null || "".equals(str)){
                    flag = false ;
                }else {
                    if ("bye".equals(str)){
                        flag =false;
                    }else {
                        out.println("echo: "+str);
                    }
                }
            }
            out.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
