package com.zhuo.design.patterns.template;

/**
 * Created by yizhuo on 2018/5/20.
 */
public class RsaSendHttpTemplate extends  AbstractSendHttpTemplate {
    @Override
    Object encryption() {
        //rsa encryption
        return null;
    }

    @Override
    Object decryption() {
        //rsa decryption
        return null;
    }
}
