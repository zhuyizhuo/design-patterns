package com.yizhuo.learning.patterns.prototype.deep;

import java.util.List;

/**
 * Created by yizhuo on 2018/5/5.
 */
public class Prototype implements Cloneable{

    private String name;

    private List test;

    public List getTest() {
        return test;
    }

    public void setTest(List test) {
        this.test = test;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
