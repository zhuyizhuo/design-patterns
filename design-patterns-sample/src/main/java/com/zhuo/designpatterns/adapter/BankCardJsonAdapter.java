package com.zhuo.designpatterns.adapter;

import com.alibaba.fastjson.JSON;

/**
 *
 * @author yizhuo
 * @date 2018/5/29
 */
public class BankCardJsonAdapter{

    private BankCardService bankCardService = new DefaultBankCardServiceImpl();

    public String queryBankCardMsg(String userId) {
        BankCard bankCard = bankCardService.queryBankCardMsg(userId);
        return JSON.toJSONString(bankCard);
    }
}
