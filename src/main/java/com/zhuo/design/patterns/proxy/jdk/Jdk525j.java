package com.zhuo.design.patterns.proxy.jdk;

import com.zhuo.design.patterns.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class Jdk525j implements InvocationHandler {

    private Person obj;

    public Object getInstance(Person clazz){
        this.obj = clazz;
        Class<? extends Person> aClass = clazz.getClass();

        Object o = Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
        return o;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.obj, args);
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
