package com.ly.command.log;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.command.log
 * @ClassName: FileUtil
 * @Author: lin
 * @Description: 日志辅助类，用于操作日志文件
 * @Date: 2019/8/3 17:04
 * @Version: 1.0
 */
public class FileUtil {

    private FileUtil() {
    }

    /**
     * 读取文件信息，转换为list集合对象
     *
     * @param pathName 文件的路径和名字
     * @return list
     */
    public static List readFile(String pathName) {
        List list = new ArrayList();
        ObjectInputStream oin = null;

        URL resource = FileUtil.class.getClass().getResource(pathName);
        File file = new File(resource.getPath());
        try {
            if (file.exists()) {

                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                list = (List) oin.readObject();
            }else{
                throw new Exception("文件未找到");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oin != null) {
                try {
                    oin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    /**
     * 写文件，将 list 对象写入到文件中
     * @param pathName
     * @param list
     */
    public static void writeFile(String pathName, List list) {
        ObjectOutputStream out = null;

        URL resource = FileUtil.class.getClass().getResource(pathName);
        File file = new File(resource.getPath());
        try {
            if (file.exists()) {
                out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                out.writeObject(list);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out!=null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
