package com.zhuo.designpatterns.behavioral.interpreter;

/**
 * 终结符表达式角色
 * @author zhuo
 */
public class Constant extends Expression {
    private int i;

    public Constant(int i) {
        this.i = i;
    }

    @Override
    public int interpret(Context con) {
        return i;
    }
}
