package com.yizhuo.learning.patterns.proxy.cglib;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class CglibMeipoTest {
    public static void main(String[] args) {
        Zhangsan n = (Zhangsan)new CglibMeipo().getInstance(Zhangsan.class);
        n.findLove();
        System.out.println("-------------------------");
    }
}


