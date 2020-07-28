package com.zhuo.designpatterns.delegate;

/**
 *  快递员
 *
 * @author zhuo
 * @date 2018/5/29
 */
public interface Courier {

    /**
     * 发快递
     * @param sendTo 发给谁
     * @param expressDelivery 快递
     */
    void sendExpress(String sendTo, ExpressDelivery expressDelivery);
}
