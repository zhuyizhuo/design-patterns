package com.yizhuo.learning.patterns.decorator.old;

/**
 *
 * @author yizhuo
 * @date 2018/5/29
 */
public interface IUserService {

    UserInfo queryUserById(String userId);

    void registerUserInfo();
}
