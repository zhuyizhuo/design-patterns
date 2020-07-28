package com.zhuo.designpatterns.delegate;

/**
 *  快递
 *
 * @author zhuo
 * @date 2018/5/29
 */
public interface ExpressDelivery {

    /**
     * 发快递
     * @param sendTo 发给谁
     */
    void sendExpress(String sendTo);
}
