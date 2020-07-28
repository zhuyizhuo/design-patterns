package com.zhuo.design.patterns.proxy.custom;

import com.zhuo.design.patterns.proxy.Person;

import java.lang.reflect.Method;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class Mymeipo implements MyInvocationHandler {

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
        System.out.println("如果合适 ,就安排见面");
    }

    private void before() {
        System.out.println("我是媒婆 ,我帮你介绍对象");
        System.out.println("开始物色");
    }
}
