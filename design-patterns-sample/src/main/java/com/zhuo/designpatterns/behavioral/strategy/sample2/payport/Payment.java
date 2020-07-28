package com.zhuo.designpatterns.behavioral.strategy.sample2.payport;

import com.zhuo.designpatterns.behavioral.strategy.sample2.Order;
import com.zhuo.designpatterns.behavioral.strategy.sample2.Paystate;

/**
 * Created by yizhuo on 2018/5/6.
 */
public interface Payment {

    public Paystate pay(Order order);

}
