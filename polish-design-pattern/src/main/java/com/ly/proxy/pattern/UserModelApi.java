package com.ly.proxy.pattern;

/**
 * @ProjectName: Java-Guide
 * @Package: com.ly.proxy.pattern
 * @ClassName: UserModelApi
 * @Author: lin
 * @Description: 定义用户方法的接口
 * @Date: 2019/7/30 21:53
 * @Version: 1.0
 */
public interface UserModelApi {

    public String getUserId();

    public void setUserId(String userId);

    public String getName();

    public void setName(String name);

    public String getDeptId();

    public void setDeptId(String deptId);

    public String getSex();

    public void setSex(String sex);

}
