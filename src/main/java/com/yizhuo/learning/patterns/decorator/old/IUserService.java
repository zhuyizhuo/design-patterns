package com.yizhuo.learning.patterns.decorator.old;

/**
 * Created by yizhuo on 2018/5/29.
 */
public interface IUserService {

    UserInfo queryUserById(String userId);

    void registerUserInfo();
}
