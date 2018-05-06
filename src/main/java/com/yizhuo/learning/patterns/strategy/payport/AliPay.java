package com.yizhuo.learning.patterns.strategy.payport;

import com.yizhuo.learning.patterns.strategy.Order;
import com.yizhuo.learning.patterns.strategy.Paystate;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class AliPay extends AbstractPayment implements Payment {

    public Paystate pay(Order order) {
        System.out.println("用户 " + order.getUserId() + " 正在用" + getClassName() + "支付,金额为:" + order.getMoney());
        return Paystate.SUCCESS;
    }

}
