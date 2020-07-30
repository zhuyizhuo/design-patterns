package com.zhuo.designpatterns.behavioral.strategy.sample1;
/**
 *
 策略模式

 动机：
    在软件构建过程中，某些对象使用的算法可能多种多样，经常改变，如果将这些算法都编码对象中，将会使对象变得异常复杂;而且有时候支持不使用的算法也是一个性能负担。
    如何在运行时根据需要透明地更改对象的算法？将算法与对象本身解耦，从而避免上述问题？
意图：
    定义一系统的算法，把它们一个个封装起来，并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化。
                                                                     --------《设计模式》GOF
                                                                     
适用性：
    1.许多相关的类仅仅是行为有异。“策略”提供了一种用多个行为中的一个行为来配置一个类的方法。
    2.需要使用一个算法的不同变体。例如，你可能会定义一些反映不同的空间/时间权衡的算法。当这些变体实现为一个算法的类层次时[H087]，可以使用策略模式。    
    3.算法使用客户不应该知道数据。可使用策略模式以避免暴露复杂的，与算法相关的数据结构。
    4.一个类定义了多种行为，并且这些行为在这个类的操作中以多个条件语句的形式出现。将相关的条件分支移入它们各自的Strategy类中以代替这些条件语句。
    

Strategy模式的几个要点：
    1.Strategy及其子类为组件提供了一系列可重用的算法，从而可以使得类型在运行时方便地根据需要在各个算法之间进行切换。所谓封装算法，支持算法的变化。
    2.Strategy模式提供了用条件判断语句以外的另一种选择，消除条件判断语句，就是在解耦合。含有许多条件判断语句的代码通常都需要Strategy模式。
    3.与State类似，如果Strategy对象没有实例变量，那么各个上下文可以共享同一个Strategy对象，从而节省对象开销。
    
 * 我们看一下代码所示Strategy的协作方式 ,Context将客户请求转发给Strategy.
 * 客户通常创建并传递一个ConcreteStrategy 对象给Context.这样,客户仅与Context
 * 打交道,而Strategy和Context 相互作用,以实现选定的算法.当算法被调用时,
 * Context可以将该算法需要的数据都传递给Strategy.或者,Context 也可以将自身作为一个
 * 参数传递给Strategy.这样,Strategy在需要时可以回调Context
 */

/*
 * 通常持有一个Strategy对象请求,也可以持有一个Strategy对象引用的聚集.
 * 定义一系列客户接口的方法,将客户请求委托给Strategy的算法实现
 */
class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextRequest() {
        // 委托具体策略的算法实现
        strategy.doAlgorithm();
    }

    public void contextCallBackRequest() {
        // Context 可以将自身作为一个参数传递给Strategy方法
        strategy.doAlgorithm(this);
    }
}



/*
 *定义算法持有的公共接口.
 *Context使用这个接口来调用某ConcreteStrategy定义的算法
 */
interface Strategy {
    void doAlgorithm();

    // Context 可以将自身作为一个参数传递给Strategy方法
    void doAlgorithm(Context context);
}


/*
 * 实现Strategy接口的具体算法
 */
class ConcreteStrategy implements Strategy {

    public void doAlgorithm() {
        System.out.println("doAlgorithm()");
    }

    public void doAlgorithm(Context context) {
        System.out.println("callback doAlgorithm");
        context.contextCallBackRequest();
    }

}

public class StrategyTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy();
        Context context = new Context(strategy);
        context.contextRequest();
    }

}
