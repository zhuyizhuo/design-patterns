package com.zhuo.designpatterns.delegate;

/**
 * 我要发快递
 * @author zhuo
 * @date 2018/5/29
 */
public class TestSend {
    public static void main(String[] args) {
        //我选择快递公司发快递  快递公司根据派发地不同 委派不同快递员去具体派发
        ExpressCompany expressDelivery = new ExpressCompany();
        expressDelivery.sendExpress("朝阳", new ExpressDelivery("Java 📚"));
    }
}