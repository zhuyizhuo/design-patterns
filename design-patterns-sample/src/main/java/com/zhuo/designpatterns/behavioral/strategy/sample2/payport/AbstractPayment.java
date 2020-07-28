package com.zhuo.designpatterns.behavioral.strategy.sample2.payport;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class AbstractPayment {
    public String getClassName() {
        String name = this.getClass().getSimpleName();
        return name;
    }
}
