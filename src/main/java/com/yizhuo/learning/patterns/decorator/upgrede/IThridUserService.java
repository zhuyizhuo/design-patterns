package com.yizhuo.learning.patterns.decorator.upgrede;

import com.yizhuo.learning.patterns.decorator.old.IUserService;
import com.yizhuo.learning.patterns.decorator.old.UserInfo;

/**
 *
 * @author yizhuo
 * @date 2018/5/29
 */
public interface IThridUserService extends IUserService {

    UserInfo queryThridUserInfo();

    void registerThridUser();

}
