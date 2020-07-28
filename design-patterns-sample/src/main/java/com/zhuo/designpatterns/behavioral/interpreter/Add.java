package com.zhuo.designpatterns.behavioral.interpreter;

/**
 * 非终结符表达式角色
 * 加法
 * @author zhuo
 */
public class Add extends Expression {
    private Expression left, right;

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context con) {
        return left.interpret(con) + right.interpret(con);
    }
}
