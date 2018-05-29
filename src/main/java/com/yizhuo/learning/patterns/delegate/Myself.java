package com.yizhuo.learning.patterns.delegate;

/**
 * Created by yizhuo on 2018/5/29.
 */
public class Myself {
    public static void main(String[] args) {
        ExpressCompany expressDelivery = new ExpressCompany();
        expressDelivery.sendExpress("朝阳");
    }
}
