package com.yizhuo.learning.patterns.adapter;

/**
 *
 * @author yizhuo
 * @date 2018/5/29
 */
public class DefaultBankCardServiceImpl implements BankCardService {
    public BankCard queryBankCardMsg(String userId) {
        BankCard bankCard = new BankCard();
        bankCard.setCardNo("132465");
        bankCard.setUserId(userId);
        bankCard.setBankCode("ICBC");
        bankCard.setId("123456789");
        return bankCard;
    }
}
