package com.dubbo.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerMain {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                new String[] { "dubbo_server.xml" });
        applicationContext.start();
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }

}
