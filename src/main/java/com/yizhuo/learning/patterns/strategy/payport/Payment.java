package com.yizhuo.learning.patterns.strategy.payport;

import com.yizhuo.learning.patterns.strategy.Order;
import com.yizhuo.learning.patterns.strategy.Paystate;

/**
 * Created by yizhuo on 2018/5/6.
 */
public interface Payment {

    public Paystate pay(Order order);

}
