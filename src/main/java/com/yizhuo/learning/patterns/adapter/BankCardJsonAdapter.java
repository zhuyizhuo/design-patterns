package com.yizhuo.learning.patterns.adapter;

import com.alibaba.fastjson.JSON;

/**
 * Created by yizhuo on 2018/5/29.
 */
public class BankCardJsonAdapter{

    private BankCardService bankCardService = new DefaultBankCardServiceImpl();

    public String queryBankCardMsg(String userId) {
        BankCard bankCard = bankCardService.queryBankCardMsg(userId);
        return JSON.toJSONString(bankCard);
    }
}
