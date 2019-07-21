package com.ly.adaptor.no_pattern;

import com.ly.adaptor.LogModel;

import java.io.*;
import java.net.URL;
import java.util.List;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.adaptor.no_pattern
 * @ClassName: LogFileOperate
 * @Author: lin
 * @Description: 实现对日志文件的操作
 * @Date: 2019/7/20 17:18
 * @Version: 1.0
 */
public class LogFileOperate implements LogFileOperateApi {

    private String logFilePathName = "/adaptor/AdaptorLog.log";

    /**
     * 判断是否传入日志文件路径和名称，没有者使用默认的日志文件
     *
     * @param logFilePathName
     */
    public LogFileOperate(String logFilePathName) {
        if (logFilePathName != null && logFilePathName.trim().length() > 0) {
            this.logFilePathName = logFilePathName;
        }
    }

    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;

        try {
            URL resource = this.getClass().getResource(logFilePathName);

            File file = new File(resource.getPath());
            if (file.exists()) {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                list = (List<LogModel>) oin.readObject();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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

    @Override
    public void writeLogFile(List<LogModel> list) {
        URL resource = LogFileOperate.class.getResource(logFilePathName);
        File file = new File(resource.getPath());
        ObjectOutputStream oout = null;
        try {
            oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            oout.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oout != null) {
                try {
                    oout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
