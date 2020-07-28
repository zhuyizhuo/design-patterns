package com.zhuo.designpatterns.decorator.upgrede;

import com.zhuo.designpatterns.decorator.old.IUserService;
import com.zhuo.designpatterns.decorator.old.UserInfo;

/**
 *
 * @author yizhuo
 * @date 2018/5/29
 */
public interface IThridUserService extends IUserService {

    UserInfo queryThridUserInfo();

    void registerThridUser();

}
