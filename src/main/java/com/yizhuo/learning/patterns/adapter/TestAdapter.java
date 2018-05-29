package com.yizhuo.learning.patterns.adapter;

/**
 * Created by yizhuo on 2018/5/29.
 */
public class TestAdapter {
    public static void main(String[] args) {
        BankCardJsonAdapter bankCardJsonAdapter = new BankCardJsonAdapter();
        String s = bankCardJsonAdapter.queryBankCardMsg("111");
        System.out.println(s);
    }
}
