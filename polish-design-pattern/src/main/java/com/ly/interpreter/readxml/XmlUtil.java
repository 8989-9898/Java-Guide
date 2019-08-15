package com.ly.interpreter.readxml;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.readxml
 * @ClassName: XmlUtil
 * @Author: lin
 * @Description: 读取XML 的工具类
 * @Date: 2019-08-15 10:58
 * @Version: 1.0
 */
public class XmlUtil {

    public static Document getRoot(final String path)throws Exception{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance ();
        DocumentBuilder builder = factory.newDocumentBuilder ();
        URL url = XmlUtil.class.getResource (path);
        File file = new File (url.getPath ());
        Document document = builder.parse (file);
        document.normalize ();
        return document;
    }
}
