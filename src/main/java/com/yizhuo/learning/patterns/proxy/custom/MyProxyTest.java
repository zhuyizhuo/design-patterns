package com.yizhuo.learning.patterns.proxy.custom;

import com.yizhuo.learning.patterns.proxy.Person;
import com.yizhuo.learning.patterns.proxy.jdk.Zhangsan;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class MyProxyTest {

    public static void main(String[] args) {
        Person instance = (Person)new Mymeipo().getInstance(new Zhangsan());
        instance.findLove();
    }
}
