package com.zhuo.designpatterns.proxy.custom;

import com.zhuo.designpatterns.proxy.Person;
import com.zhuo.designpatterns.proxy.jdk.Zhangsan;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class MyProxyTest {

    public static void main(String[] args) {
        Person instance = (Person)new Mymeipo().getInstance(new Zhangsan());
        instance.findLove();
    }
}
