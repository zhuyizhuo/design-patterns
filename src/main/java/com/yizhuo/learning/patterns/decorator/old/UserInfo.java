package com.yizhuo.learning.patterns.decorator.old;

/**
 *
 * @author yizhuo
 * @date 2018/5/29
 */
public class UserInfo {
    private String name;
    private String height;
    private String userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
