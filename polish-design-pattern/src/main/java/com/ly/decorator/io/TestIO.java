package com.ly.decorator.io;

import java.io.*;
import java.net.URL;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.decorator.io
 * @ClassName: TestIO
 * @Author: lin
 * @Description: 测试java中的装饰模式
 * @Date: 2019-08-15 17:07
 * @Version: 1.0
 */
public class TestIO {
    public static void main(String[] args) {
        URL url = TestIO.class.getResource ("/decorator/IOTest.txt");
        File file = new File (url.getPath ());
        DataInputStream dis=null;
        try {
            dis=new DataInputStream (new BufferedInputStream (new FileInputStream (file)));
            byte[] bytes=new byte[dis.available ()];
            dis.read (bytes);
            System.out.println ("文件内容是==========》"+new String (bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }finally {
            if (dis!=null) {
                try {
                    dis.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        }
    }
}
