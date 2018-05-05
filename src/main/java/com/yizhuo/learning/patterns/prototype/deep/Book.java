package com.yizhuo.learning.patterns.prototype.deep;

/**
 * Created by yizhuo on 2018/5/5.
 */
public class Book implements Cloneable{

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book)super.clone();
    }
}
