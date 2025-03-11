package com.zhuo.designpatterns.behavioral.chainofresponsibility.sample1;



/**
 责任链/职责链模式

 动机(Motivate)：
     在软件构建过程中，一个请求可能被多个对象处理，但是每个请求在运行时只能有一个接受者，如果显示指定，将必不可少地带来请求发送者与接受者的紧耦合。
     如何使请求的发送者不需要指定具体的接受者？让请求的接受者自己在运行时决定来处理请求，从而使两者解耦。

 意图(Intent)：
    使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。

 适用性：
     1.有多个对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定。
     2.你想在不明确接收者的情况下，向多个对象中的一个提交一个请求。
     3.可处理一个请求的对象集合应被动态指定。

 Chain of Responsibility 实现要点：
 1.Chain of Responsibility 模式的应用场合在于"一个请求可能有多个接受者，但是最后真正的接受者只有一个”，
    只有这时候请求发送者与接受者的耦合才有可能出现“变化脆弱”的症状，职责链的目的就是将二者解耦，从而更好地应对变化。
 2.应用了 Chain of Responsibility 模式后，对象的职责分派将更具灵活性。我们可以在运行时动态添加/修改请求的处理职责。
 3.如果请求传递到职责链的未尾仍得不到处理，应该有一个合理的缺省机制。这也是每一个接受对象的责任，而不是发出请求的对象的责任。

 * @author zhuo
 */
public class ChainOfResponsibilityClient {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler("1号");
        Handler handler2 = new ConcreteHandler("2号");
        handler1.setSuccessor(handler2);
        handler1.handleRequest(new Request("具体请求",-1));
    }
}