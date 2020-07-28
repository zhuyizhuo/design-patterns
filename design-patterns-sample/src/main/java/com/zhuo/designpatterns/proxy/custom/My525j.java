package com.zhuo.designpatterns.proxy.custom;

import com.zhuo.designpatterns.proxy.Person;

import java.lang.reflect.Method;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class My525j implements MyInvocationHandler {

    private Person p ;

    public Object getInstance(Person target){
        this.p = target;
        Class<? extends Person> aClass = target.getClass();
        Object instance = Myproxy.getInstance(new MyclassLoader(), aClass.getInterfaces(), this);
        return instance;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.p, args);
        after();
        return invoke;
    }

    private void after() {
        System.out.println("匹配到合适的  开始带你看房");
    }

    private void before() {
        System.out.println("收房子");
    }
}
