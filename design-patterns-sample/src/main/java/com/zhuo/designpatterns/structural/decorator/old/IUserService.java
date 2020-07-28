package com.zhuo.designpatterns.structural.decorator.old;

/**
 *
 * @author zhuo
 * @date 2018/5/29
 */
public interface IUserService {

    UserInfo queryUserById(String userId);

    void registerUserInfo();
}
