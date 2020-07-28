package com.zhuo.design.patterns.decorator.upgrede;

import com.zhuo.design.patterns.decorator.old.IUserService;
import com.zhuo.design.patterns.decorator.old.UserInfo;

/**
 *
 * @author yizhuo
 * @date 2018/5/29
 */
public interface IThridUserService extends IUserService {

    UserInfo queryThridUserInfo();

    void registerThridUser();

}
