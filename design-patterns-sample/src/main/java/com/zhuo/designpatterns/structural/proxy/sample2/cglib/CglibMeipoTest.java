package com.zhuo.designpatterns.structural.proxy.sample2.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class CglibMeipoTest {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"code");

        Zhangsan n = (Zhangsan)new CglibMeipo().getInstance(Zhangsan.class);
        n.findLove();
        System.out.println("-------------------------");

    }
}


