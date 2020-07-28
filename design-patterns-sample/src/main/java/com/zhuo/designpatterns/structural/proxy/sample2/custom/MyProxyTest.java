package com.zhuo.designpatterns.structural.proxy.sample2.custom;

import com.zhuo.designpatterns.structural.proxy.sample2.Person;
import com.zhuo.designpatterns.structural.proxy.sample2.jdk.Zhangsan;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class MyProxyTest {

    public static void main(String[] args) {
        Person instance = (Person)new Mymeipo().getInstance(new Zhangsan());
        instance.findLove();
    }
}
