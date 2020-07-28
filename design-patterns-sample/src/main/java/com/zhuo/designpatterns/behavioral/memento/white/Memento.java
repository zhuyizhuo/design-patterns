package com.zhuo.designpatterns.behavioral.memento.white;

/**
 * @author zhuo
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setState() {
        this.state = state;
    }
}
