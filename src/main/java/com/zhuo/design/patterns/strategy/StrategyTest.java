package com.zhuo.design.patterns.strategy;

import com.zhuo.design.patterns.strategy.payport.PayType;

import java.math.BigDecimal;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class StrategyTest {

    public static void main(String[] args) {
        Order order = new Order("0001", BigDecimal.TEN, "123456");
        Paystate pay = order.pay(PayType.ALI_PAY);
        System.out.println(pay);
    }
}
