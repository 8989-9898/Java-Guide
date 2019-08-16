package com.ly.decorator.io.my;


import java.io.*;
import java.net.URL;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.io.my
 * @ClassName: Client
 * @Author: lin
 * @Description: 测试自定义IO流
 * @Date: 2019-08-15 17:22
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        URL url = Client.class.getResource ("/decorator/encrypt.log");
        File file = new File (url.getPath ());
        // 将加密的流放入到输出流中
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream (new BufferedOutputStream (new EncryptOutputStream (new FileOutputStream (file))));
            dos.writeBytes ("abcdfdfdef");
            dos.flush ();
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            if (dos!=null) {
                try {
                    dos.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        }
    }
}
