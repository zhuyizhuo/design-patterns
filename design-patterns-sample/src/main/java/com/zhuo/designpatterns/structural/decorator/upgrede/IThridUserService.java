package com.zhuo.designpatterns.structural.decorator.upgrede;

import com.zhuo.designpatterns.structural.decorator.old.IUserService;
import com.zhuo.designpatterns.structural.decorator.old.UserInfo;

/**
 *
 * @author zhuo
 * @date 2018/5/29
 */
public interface IThridUserService extends IUserService {

    UserInfo queryThridUserInfo();

    void registerThridUser();

}
