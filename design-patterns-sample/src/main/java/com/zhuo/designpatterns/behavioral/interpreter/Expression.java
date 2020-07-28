package com.zhuo.designpatterns.behavioral.interpreter;

/**
 * 抽象表达式角色，也可以用接口来实现
 * @author zhuo
 */
public abstract class Expression {
    public abstract int interpret(Context con);
}
