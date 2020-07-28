package com.zhuo.designpatterns.decorator.test;

import com.zhuo.designpatterns.decorator.old.UserServiceImpl;
import com.zhuo.designpatterns.decorator.upgrede.IThridUserService;
import com.zhuo.designpatterns.decorator.upgrede.ThridUserServiceImpl;

/**
 * 装饰器模式
 * @author yizhuo
 * @date 2018/5/29
 */
public class DecoratorTest {
    /**
       ===============================================================------
       装饰器模式                            |   适配器模式
       ------------------------------------+---------------------------------
       是一种非常特别的适配器模式               |  可以不保留层级关系
       ------------------------------------+---------------------------------
       装饰者和被装饰者都要实现同一个接口        |  适配者和被适配者没有必然的层级联系
       主要目的是为了扩展，依旧保留OOP关系       |  通常采用代理或者继承形式进行包装
       ------------------------------------+----------------------------------
       满足is-a的关系                        |   满足has-a
       ------------------------------------+----------------------------------
       注重的是覆盖、扩展                     |   注重兼容、转换
       ------------------------------------+----------------------------------
       */
    public static void main(String[] args) {
        IThridUserService service = new ThridUserServiceImpl(new UserServiceImpl());
        service.registerUserInfo();

        service.registerThridUser();
    }
}
