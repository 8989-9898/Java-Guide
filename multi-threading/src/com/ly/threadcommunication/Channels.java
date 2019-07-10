package com.ly.threadcommunication;


import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.threadcommunication
 * @ClassName: Channels
 * @Author: lin
 * @Description: 使用线程之间的通讯流进行通讯
 * @Date: 2019-06-26 17:04
 * @Version: 1.0
 */
public class Channels {
    public static void main(String[] args) throws IOException, InterruptedException {
        Writer writer = new Writer();
        Reader reader = new Reader();
        /**
         * 字节的有PipedInputStream、PipedOutputStream
         * 字符的有 PipedWriter、PipedReader
         */
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream();
        // 将输入和输出两个通道进行连接
        in.connect(out);
        Thread a = new Thread(() -> {
            writer.writer(out);
        });

        Thread b = new Thread(() -> {
            reader.reader(in);
        });
        a.start();
        Thread.sleep(2000);
        b.start();
    }
}

class Writer {
    /**
     * 使用PipedOutputStream进行读操作
     *
     * @param out
     */
    public void writer(PipedOutputStream out) {
        try {
            for (int i = 0; i < 500; i++) {
                out.write(("第" + i + "次").getBytes());
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Reader {
    /**
     * 使用PipedInputStream进行读操作
     *
     * @param in
     */
    public void reader(PipedInputStream in) {
        try {
            byte[] bytes = new byte[200];
            int read = in.read(bytes);
            while (read != -1) {
                String data = new String(bytes, 0, read);
                System.out.println("read:" + data);
                read = in.read(bytes);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("我想先执行");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        // thread.join();
        thread.join(1000);
        System.out.println("我想在子线程执行完毕后再执行");
    }
}
