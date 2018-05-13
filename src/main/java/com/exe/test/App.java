package com.exe.test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        for(;;){
            InputStream input = System.in;
            byte[] b = new byte[1024];
            try {
                int len = input.read(b);
                System.out.println("你输入的是："+new String(b,0,len));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
