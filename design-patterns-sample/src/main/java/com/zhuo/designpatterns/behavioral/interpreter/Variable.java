package com.zhuo.designpatterns.behavioral.interpreter;

/**
 * @author zhuo
 */
public class Variable extends Expression {
    @Override
    public int interpret(Context con) {
        // this为调用interpret方法的Variable对象
        return con.LookupValue(this);
    }
}
