package com.yizhuo.learning.patterns.delegate;

/**
 * Created by yizhuo on 2018/5/29.
 */
public class Myself {
    public static void main(String[] args) {
        //我选择快递公司发快递  快递公司根据派发地不同 委派不同快递员去具体派发
        ExpressCompany expressDelivery = new ExpressCompany();
        expressDelivery.sendExpress("朝阳");
    }
}
