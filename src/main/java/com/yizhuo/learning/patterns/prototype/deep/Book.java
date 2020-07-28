package com.yizhuo.learning.patterns.prototype.deep;

/**
 *
 * @author yizhuo
 * @date 2018/5/5
 */
public class Book implements Cloneable{

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book)super.clone();
    }
}
