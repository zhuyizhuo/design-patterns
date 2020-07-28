package com.zhuo.designpatterns.creational.prototype.deep;

/**
 *
 * @author zhuo
 * @date 2018/5/5
 */
public class Book implements Cloneable{

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return (Book)super.clone();
    }
}
