package com.zhuo.designpatterns.behavioral.strategy.sample2.payport;

import com.zhuo.designpatterns.behavioral.strategy.sample2.Order;
import com.zhuo.designpatterns.behavioral.strategy.sample2.Paystate;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class ApplePay extends AbstractPayment implements Payment {
    
    public Paystate pay(Order order) {
        System.out.println("用户 " + order.getUserId() + " 正在用" + getClassName() + "支付,金额为:" + order.getMoney());
        return Paystate.SUCCESS;
    }

}
