package com.ly.interpreter.readxml;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.readxml
 * @ClassName: ElementExpression
 * @Author: lin
 * @Description: 元素作为非终止符对应的解释器，解释并执行中间的元素
 * @Date: 2019-08-15 11:11
 * @Version: 1.0
 */
public class ElementExpression extends ReadXmlExpression {

    /**
     * 用来记录组合的 ReadXmlExpression 元素
     */
    private List<ReadXmlExpression> eles = new ArrayList<> ();

    /**
     * 元素的名称
     */
    private String eleName = "";

    public ElementExpression(String eleName) {
        this.eleName = eleName;
    }

    public boolean addEle(ReadXmlExpression ele) {
        eles.add (ele);
        return true;
    }

    public boolean remove(ReadXmlExpression ele) {
        eles.remove (ele);
        return true;
    }

    @Override
    public String[] interpret(Content content) {
        // 先取出上下文中的当前元素作为父元素
        // 找到当前元素名称所对应的 xml 元素，并设置会到上下文中
        Element preEle = content.getPreEle ();
        if (preEle == null) {
            // 说明当前元素是根元素
            content.setPreEle (content.getDocument ().getDocumentElement ());
        } else {
            // 根据父级元素和要查找的元素名称来获取当前元素
            Element nowEle = content.getNowEle (preEle, eleName);
            // 把当前获取的元素放到上下文中
            content.setPreEle (nowEle);
        }
        String[] strs = null;
        // 循环调用子元素的 Interpret 方法
        for (ReadXmlExpression ele : eles) {
            strs = ele.interpret (content);
        }
        return strs;
    }
}
