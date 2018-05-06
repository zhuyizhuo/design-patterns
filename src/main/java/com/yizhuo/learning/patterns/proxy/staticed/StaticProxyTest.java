package com.yizhuo.learning.patterns.proxy.staticed;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        Agency agency = new Agency(new John());
        agency.registerCompany();
    }

}
