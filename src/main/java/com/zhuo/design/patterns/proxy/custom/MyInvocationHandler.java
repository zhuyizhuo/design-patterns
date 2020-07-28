package com.zhuo.design.patterns.proxy.custom;

import java.lang.reflect.Method;

/**
 * Created by yizhuo on 2018/5/6.
 */
public interface MyInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
