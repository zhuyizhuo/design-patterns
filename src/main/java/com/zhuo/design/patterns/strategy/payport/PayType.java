package com.zhuo.design.patterns.strategy.payport;

/**
 * Created by yizhuo on 2018/5/6.
 */
public enum  PayType {

    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay()),
    UNION_PAY(new UnionPay()),
    APPLE_PAY(new ApplePay()),
    ;

    private Payment payment;

    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment get(){
        return this.payment;
    }
}
