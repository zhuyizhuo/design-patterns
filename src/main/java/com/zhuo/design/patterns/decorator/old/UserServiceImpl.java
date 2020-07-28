package com.zhuo.design.patterns.decorator.old;

/**
 *
 * @author yizhuo
 * @date 2018/5/29
 */
public class UserServiceImpl implements IUserService {

    public UserInfo queryUserById(String userId) {
        System.out.println("查询用户信息");
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfo.setName("test");
        return userInfo;
    }

    public void registerUserInfo() {
        System.out.println("用户注册");
    }
}
