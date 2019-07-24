package com.ly.abstractfactory.simple;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.abstractfactory.simple
 * @ClassName: CPUFactory
 * @Author: lin
 * @Description: 构建 CPU 的简单工厂
 * @Date: 2019-07-24 8:51
 * @Version: 1.0
 */
public class CPUFactory {

    /**
     * 创建 CPU 接口对象的方法
     * @param type 根据参数选择 CPU 的类型
     * @return 具体类型的 CPU 的实现
     */
    public static CPUApi createCPUApi(int type){
        CPUApi api=null;
        if (type==1) {
            api=new IntelCPU(1156);
        }else if (type==2){
            api=new AMDCPU(939);
        }
        return api;
    }
}
