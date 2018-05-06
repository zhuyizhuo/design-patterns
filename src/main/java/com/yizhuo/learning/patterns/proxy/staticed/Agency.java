package com.yizhuo.learning.patterns.proxy.staticed;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class Agency {

    private Entrepreneur person;

    public Agency(Entrepreneur person) {
        this.person = person;
    }

    public void registerCompany(){
        beforeRegister();

        person.registerCompany();

        afterRegister();
    }

    private void afterRegister() {
        System.out.println("撤资");
    }

    private void beforeRegister() {
        System.out.println("注资");
    }
}
