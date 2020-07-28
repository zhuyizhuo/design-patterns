package com.zhuo.designpatterns.strategy.payport;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class AbstractPayment {
    public String getClassName() {
        String name = this.getClass().getSimpleName();
        return name;
    }
}
