package com.zhuo.designpatterns.structural.adapter.sample2;

/**
 *
 * @author zhuo
 * @date 2018/5/29
 */
public class BankCard {
    private String id;
    private String cardNo;
    private String userId;

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    private String bankCode;
}
