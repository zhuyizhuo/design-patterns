package com.zhuo.designpatterns.structural.decorator.old;

/**
 *
 * @author zhuo
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
