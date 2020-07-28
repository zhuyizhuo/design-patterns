package com.zhuo.designpatterns.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class CglibMeipo implements MethodInterceptor{

    public Object getInstance(Class<?> obj){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是媒婆 我帮你找对象");

        @SuppressWarnings("unused")
		Object o1 = methodProxy.invokeSuper(o, objects);

        System.out.println("安排见面");
        return null;
    }


}
