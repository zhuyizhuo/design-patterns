package com.zhuo.designpatterns.behavioral.interpreter;

// 终结符表达式角色

/**
 解释器模式

 动机(Motivate):
     在软件构建过程中，如果某一特定领域的问题比较复杂，类似的模式不断重复出现，如果使用普通的编程方式来实现将面临非常频繁的变化。
     在这种情况下，将特定领域的问题表达为某种文法规则下的句子，然后构建一个解释器来解释这样的句子，从而达到解决问题的目的。

 意图(Intent):
    给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。

 适用性：
     1.当有一个语言需要解释执行，并且你可将该语言中的句子表示为一个抽象语法树时，可使用解释器模式。
     而当存在以下情况时该模式效果最好：
     2.该文法简单对于复杂的文法，文法的类层次变得庞大而无法管理。此时语法分析程序生成器这样的工具是更好的选择。
     它们无需构建抽象语法树即可解释表达工，这样可以节省空间而且还可能节省时间。
     3.效率不是一个关键问题最高效的解释器通常不是通过直接解释语法分析树实现的，而是首先将它们转换成另一种
     形式。例如：正则表达式通常被转换成状态机。但即使在这种情况下，转换器仍可用解释器模式实现，该模式仍
     是有用的。

 Interpreter 实现要点：
     Interpreter 模式的应用场合是 interpreter 模式应用中的难点，只有满足"业务规则频繁变化，且类似的模式不断重复出现，并且容易抽象为语法规则的问题"才适合使用 Interpreter 模式。
     使用 Interpreter 模式来表示文法规则，从而可以使用面向对象技巧来方便地“扩展”文法。
     Interpreter 模式比较适合简单的文法表示，对于复杂的文法表示，Interpreter 模式会产生比较大的类层次结构，需要求助于语法分析生成器这样的标准工具。

 * @author zhuo
 */
public class InterpreterClient {
    private static Expression ex;

    private static Context con;

    /**
     * 测试程序，计算 (a*b)/(a-b+2)
     */
    public static void main(String[] args) {
        con = new Context();
        // 设置变量、常量
        Variable a = new Variable();
        Variable b = new Variable();
        Constant c = new Constant(2);
        // 为变量赋值
        con.addValue(a, 5);
        con.addValue(b, 7);
        // 运算，对句子的结构由我们自己来分析，构造
        ex = new Division(new Multiply(a, b), new Add(new Subtract(a, b), c));
        System.out.println("运算结果为：" + ex.interpret(con));
    }
}
