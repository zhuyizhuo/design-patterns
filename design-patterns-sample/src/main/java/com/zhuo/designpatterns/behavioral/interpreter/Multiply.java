package com.zhuo.designpatterns.behavioral.interpreter;

/**
 * @author zhuo
 */
public class Multiply extends Expression {
    private Expression left, right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context con) {
        return left.interpret(con) * right.interpret(con);
    }
}
