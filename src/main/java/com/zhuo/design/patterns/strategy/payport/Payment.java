package com.zhuo.design.patterns.strategy.payport;

import com.zhuo.design.patterns.strategy.Order;
import com.zhuo.design.patterns.strategy.Paystate;

/**
 * Created by yizhuo on 2018/5/6.
 */
public interface Payment {

    public Paystate pay(Order order);

}
