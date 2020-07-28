package com.zhuo.designpatterns.strategy.payport;

import com.zhuo.designpatterns.strategy.Order;
import com.zhuo.designpatterns.strategy.Paystate;

/**
 * Created by yizhuo on 2018/5/6.
 */
public interface Payment {

    public Paystate pay(Order order);

}
