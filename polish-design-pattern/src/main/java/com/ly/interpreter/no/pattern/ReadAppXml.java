package com.ly.interpreter.no.pattern;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.iterpreter.no.pattern
 * @ClassName: ReadAppXml
 * @Author: lin
 * @Description: 读取配置XML文件的实例
 *              使用该种方式获取的配置信息，不宜与扩展，如 配置文件发生了改变，那么读取配置信息的方法也要改变，有的时候相当于重写读取配置信息的方法
 * @Date: 2019-08-15 10:03
 * @Version: 1.0
 */
public class ReadAppXml {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        ReadAppXml xml = new ReadAppXml ();
        xml.readXML ("/interpreter/JDBC.xml");
    }

    public void readXML(final String filePath) throws ParserConfigurationException, IOException, SAXException {
        URL url = this.getClass ().getResource (filePath);
        File file = new File (url.getPath ());
        System.out.println (url.getPath ());
        // 建立一个解析工厂
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance ();
        // 获得一个 DocumentBuilder 对象，具体的 dom 解析器
        DocumentBuilder builder = factory.newDocumentBuilder ();
        // 得到一个表示 xml 文档的 Document 对象
        Document doc = builder.parse (file);
        // 去掉 xml 中作为格式化内容的空白而映射在 dom 树中的 Text Node 对象
        doc.normalize ();
        // 获取JDBC信息
        NodeList jdbc = doc.getElementsByTagName ("jdbc");
        NodeList driver = ((Element) jdbc.item (0)).getElementsByTagName ("jdbc-driver");
        String driverName = driver.item (0).getFirstChild ().getNodeValue ();

        NodeList urls = ((Element) jdbc.item (0)).getElementsByTagName ("url");
        String urlsName = urls.item (0).getFirstChild ().getNodeValue ();

        NodeList user = ((Element) jdbc.item (0)).getElementsByTagName ("username");
        String username = user.item (0).getFirstChild ().getNodeValue ();

        NodeList pass = ((Element) jdbc.item (0)).getElementsByTagName ("password");
        String password = pass.item (0).getFirstChild ().getNodeValue ();
        System.out.println ("JDBC驱动类："+driverName);
        System.out.println ("JDBC路劲："+urlsName);
        System.out.println ("JDBC用户名："+username);
        System.out.println ("JDBC密码："+password);
        // 获取 application-xml 的信息
        NodeList spring = doc.getElementsByTagName ("application-xml");
        String nodeValue = spring.item (0).getFirstChild ().getNodeValue ();
        System.out.println ("Spring的配置信息："+nodeValue);

    }
}
