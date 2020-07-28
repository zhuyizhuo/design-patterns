package com.zhuo.design.patterns.proxy.custom;

import com.zhuo.design.patterns.proxy.Person;
import com.zhuo.design.patterns.proxy.jdk.Zhangsan;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class MyProxyTest {

    public static void main(String[] args) {
        Person instance = (Person)new Mymeipo().getInstance(new Zhangsan());
        instance.findLove();
    }
}
