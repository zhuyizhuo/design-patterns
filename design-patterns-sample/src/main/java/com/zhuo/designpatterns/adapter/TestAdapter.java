package com.zhuo.designpatterns.adapter;

/**
 * 适配器模式
 * @author yizhuo
 * @date 2018/5/29
 */
public class TestAdapter {
    public static void main(String[] args) {
        //BankCardJsonAdapter  将接口返回类型由对象适配成json  简单例子
//         也可以适配成其他对象或者其他格式
        BankCardJsonAdapter bankCardJsonAdapter = new BankCardJsonAdapter();
        String s = bankCardJsonAdapter.queryBankCardMsg("111");
        System.out.println(s);
    }
}
