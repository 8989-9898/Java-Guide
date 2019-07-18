package com.ly.facade.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.facade
 * @ClassName: ConfigModel
 * @Author: lin
 * @Description: 代码生成器的示意的配置描述的数据 Model
 * @Date: 2019/7/18 21:01
 * @Version: 1.0
 */
public class ConfigModel {

    /**
     * 是否生成表示层，默认 true
     */
    private boolean needGenPresentation=true;

    /**
     * 是否生成逻辑层， 默认 true
     */
    private boolean needGenBusiness=true;

    /**
     * 是否生成 数据层， 默认 true
     */
    private boolean needGenDao=true;

    public boolean isNeedGenPresentation() {
        return needGenPresentation;
    }

    public void setNeedGenPresentation(boolean needGenPresentation) {
        this.needGenPresentation = needGenPresentation;
    }

    public boolean isNeedGenBusiness() {
        return needGenBusiness;
    }

    public void setNeedGenBusiness(boolean needGenBusiness) {
        this.needGenBusiness = needGenBusiness;
    }

    public boolean isNeedGenDao() {
        return needGenDao;
    }

    public void setNeedGenDao(boolean needGenDao) {
        this.needGenDao = needGenDao;
    }
}
