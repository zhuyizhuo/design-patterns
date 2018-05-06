package com.yizhuo.learning.patterns.proxy.jdk;

import com.yizhuo.learning.patterns.proxy.Person;
import com.yizhuo.learning.patterns.proxy.staticed.Entrepreneur;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class Zhangsan implements Person {


    public void findHouse() {
        System.out.println("张三需要找房子.");
    }

    public void findLove() {
        System.out.println("找对象");
        System.out.println("肤白貌美 大长腿");
    }
}
