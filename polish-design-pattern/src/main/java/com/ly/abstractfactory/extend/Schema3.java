package com.ly.abstractfactory.extend;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.extend
 * @ClassName: Schema3
 * @Author: lin
 * @Description: 方案三：Intel的CPU 加 技嘉的主板 加 现代的内存
 * @Date: 2019-07-24 10:32
 * @Version: 1.0
 */
public class Schema3 implements AbstractFactory{

    @Override
    public Object createProduct(int type) {
        Object object=null;
        if (type==1) {
            object=new IntelCPU(1333);
        }else if (type==2){
            object=new GAMainBoard(1333);
        }else if (type==3){
            object=new HyMemory();
        }
        return object;
    }
}
