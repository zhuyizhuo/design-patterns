package com.zhuo.design.patterns.strategy;

/**
 * Created by yizhuo on 2018/5/6.
 */
public enum Paystate {

    SUCCESS("00000","成功",""),
    FAIL("99999","失败",""),
    DOING("00001","处理中",""),
    ;

    private String code;
    private String msg;
    private Object data;

    Paystate(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
