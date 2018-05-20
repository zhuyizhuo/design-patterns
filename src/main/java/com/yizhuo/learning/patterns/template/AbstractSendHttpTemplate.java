package com.yizhuo.learning.patterns.template;

/**
 * Created by yizhuo on 2018/5/13.
 */
public abstract class AbstractSendHttpTemplate {

    /**
     * 加密
     */
    abstract Object encryption();
    /**
     * 解密
     */
    abstract Object decryption();

    protected Object SendHttpRequest(){
        Object encryption = encryption();

        //to do send http;

        return decryption();
    }

}
