package com.ly.interpreter.multiple;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.interpreter.readxml
 * @ClassName: ElementExpression
 * @Author: lin
 * @Description: 单个元素作为非终止符对应的解释器，解释并执行中间的元素
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
        // 先取出上下文中父元素
        List<Element> preEle = content.getPreEle ();
        Element ele=null;
        // 找到当前元素名称所对应的 xml 元素，并设置回上下文中
        List<Element> elements=new ArrayList<> ();
        if (preEle.size () == 0) {
            // 说明当前元素是根元素
            ele= content.getDocument ().getDocumentElement ();
            elements.add (ele);
            content.setPreEle (elements);
        } else {
            for (Element element : preEle) {
                elements.addAll (content.getNowEle (element,this.eleName));
                if (elements.size ()>0) {
                    // 找到一个就停止
                    break;
                }
            }
            List<Element> list= new ArrayList<> ();
            list.add (elements.get (0));
            content.setPreEle (list);
        }
        String[] strs = null;
        // 循环调用子元素的 Interpret 方法
        for (ReadXmlExpression read : eles) {
            strs = read.interpret (content);
        }
        return strs;
    }
}
