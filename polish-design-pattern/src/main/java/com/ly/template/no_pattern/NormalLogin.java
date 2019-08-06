package com.ly.template.no_pattern;

/**
 * @ProjectName: idea_workspace
 * @Package: com.ly.template.no_pattern
 * @ClassName: NormalLogin
 * @Author: lin
 * @Description: 普通用户的登录逻辑
 * @Date: 2019-08-06 15:53
 * @Version: 1.0
 */
public class NormalLogin {

    /**
     * 判断登录数据是否正确
     * @param model 封装登录的数据model
     * @return 是否成功 true| false
     */
    public boolean login(UserLoginModel model){
        UserModel user=this.findUserByUserId(model.getUserId());
        // 先判断用户信息是否存在
        if (user!=null){
            // 在判断登录信息是否正确
            if (model.getPwd().equals(user.getPwd()) && model.getUserId().equals(user.getUserId())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 返回一个用户信息，（查询数据库省略）
     * @param userId
     * @return
     */
    private UserModel findUserByUserId(String userId) {
        UserModel model = new UserModel();
        model.setUserId(userId);
        model.setUuid("User000001");
        model.setName("张三");
        model.setPwd("zhangsan");
        return model;
    }
}
