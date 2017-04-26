package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {


    public static void main(String[] args) throws IOException {
       // Bean bean=new Bean(2,"hh",3,8);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .disableHtmlEscaping()
                .create();
        String obj=gson.toJson("h哈哈哈哈或或或或或或或或或或或或或或或或");
        int len=obj.length();
        String h="HTTP/1.1 200 OK\nContent-length:"+len+"\n\n"+obj;
        System.out.println(h);
        ServerSocket server = new ServerSocket(8889);
        Socket client = server.accept();//定义一个Socket对象
        InputStream is = client.getInputStream();//服务器接受信息输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));//缓冲流
        OutputStream os = client.getOutputStream();//这是用来给服务器发送消息的输出流
        boolean flag = true;
        while (flag) {
            //String s = br.readLine();
            //System.out.println(s);
            os.write(h.getBytes("utf-8"));
            os.flush();
        }
        client.close();
    }
}




