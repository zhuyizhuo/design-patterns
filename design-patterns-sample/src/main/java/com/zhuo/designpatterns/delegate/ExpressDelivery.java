package com.zhuo.designpatterns.delegate;

/**
 * 快递
 * @author zhuo
 */
public class ExpressDelivery {
    /** 快递名称 */
    private String name;

    public ExpressDelivery(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
