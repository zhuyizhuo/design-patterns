package com.zhuo.designpatterns.delegate;

/**
 * 快递员 A
 * @author zhuo
 * @date 2018/5/29
 */
public class CourierA implements Courier {
    @Override
    public void sendExpress(String sendTo, ExpressDelivery expressDelivery) {
        System.out.println("我是快递员A,正在向" + sendTo + "发快递:"+ expressDelivery);
    }
}
