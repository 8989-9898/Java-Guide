package com.ly.interpreter.multiple;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.readxml
 * @ClassName: Content
 * @Author: lin
 * @Description: 上下文对象，用来包含解释器需要的一些信息
 * @Date: 2019-08-15 10:51
 * @Version: 1.0
 */
public class Content {

    /**
     * 上一个被处理的对象,多个
     */
    private List<Element> preEle = new ArrayList<> ();

    /**
     * Dom解析XML的Document 对象
     */
    private Document document = null;

    /**
     * 构造方法
     *
     * @param filePath 读取配置文件的路径名字
     * @throws Exception
     */
    public Content(final String filePath) throws Exception {
        this.document = XmlUtil.getRoot (filePath);
    }

    /**
     * 重新初始化上下文对象
     */
    public void reInit() {
        preEle = new ArrayList<> ();
    }

    /**
     * 各个 Expression 共用的方法
     * 根据父元素和当前元素的名称来获取当前多个元素的集合
     *
     * @param element 父元素
     * @param eleName 当前元素的名称
     * @return 找到的当前元素的集合
     */
    public List<Element> getNowEle(Element element, String eleName) {
        List<Element> elements = new ArrayList<> ();
        NodeList nodes = element.getChildNodes ();
        for (int i = 0; i < nodes.getLength (); i++) {
            if (nodes.item (i) instanceof Element) {
                Element ele = (Element) nodes.item (i);
                if (ele.getTagName ().equals (eleName)) {
                    elements.add (ele);
                }
            }
        }
        return elements;
    }

    public List<Element> getPreEle() {
        return preEle;
    }

    public void setPreEle(List<Element> preEle) {
        this.preEle = preEle;
    }

    public Document getDocument() {
        return document;
    }
}
