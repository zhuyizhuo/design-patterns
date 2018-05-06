package com.yizhuo.learning.patterns.strategy;

import com.yizhuo.learning.patterns.strategy.payport.PayType;

import java.math.BigDecimal;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class Order {

    private String orderId;
    private BigDecimal money;
    private String userId;

    public Order(String orderId, BigDecimal money, String userId) {
        this.orderId = orderId;
        this.money = money;
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public Paystate pay(PayType payType){
        return payType.get().pay(this);
    }
}
