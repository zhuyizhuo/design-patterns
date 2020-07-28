package com.yizhuo.learning.patterns.decorator.upgrede;

import com.yizhuo.learning.patterns.decorator.old.IUserService;
import com.yizhuo.learning.patterns.decorator.old.UserInfo;

/**
 *
 * @author yizhuo
 * @date 2018/5/29
 */
public class ThridUserServiceImpl implements IThridUserService{

    private IUserService UserServiceImpl;

    public ThridUserServiceImpl(IUserService userServiceImpl) {
        UserServiceImpl = userServiceImpl;
    }

    public UserInfo queryThridUserInfo() {
        //查询第三方用户信息
        System.out.println("查询第三方用户信息");
        return null;
    }

    public void registerThridUser() {
        //第三方系统用户注册
        System.out.println("第三方系统用户注册");
    }

    public UserInfo queryUserById(String userId) {
        //查询原来的用户信息
        return UserServiceImpl.queryUserById(userId);
    }

    public void registerUserInfo() {
//       注册用户
        UserServiceImpl.registerUserInfo();
    }
}
