package com.yizhuo.learning.patterns.delegate;

/**
 *
 * @author yizhuo
 * @date 2018/5/29
 */
public class CourierA implements ExpressDelivery{
    public void sendExpress(String sendTo) {
        System.out.println("我是快递员A,正在向" + sendTo + "发快递");
    }
}
