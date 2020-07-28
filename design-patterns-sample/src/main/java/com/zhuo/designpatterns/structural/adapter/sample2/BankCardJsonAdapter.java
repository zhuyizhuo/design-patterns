package com.zhuo.designpatterns.structural.adapter.sample2;

import com.alibaba.fastjson.JSON;

/**
 *
 * @author zhuo
 * @date 2018/5/29
 */
public class BankCardJsonAdapter{

    private BankCardService bankCardService = new DefaultBankCardServiceImpl();

    public String queryBankCardMsg(String userId) {
        BankCard bankCard = bankCardService.queryBankCardMsg(userId);
        return JSON.toJSONString(bankCard);
    }
}
