package com.zhuo.designpatterns.behavioral.chainofresponsibility.sample3;

/**
 * 具体的处理对象
 *
 * @author zhuo
 */
public class ConcreteHandlerTwo extends Handler {
    @Override
    public void handleRequest(Request request) {
        //if request is eligible handle it
        if (request.getValue() > 0) {
            System.out.println("Positive values are handled by ConcreteHandlerTwo:");
            System.out.println("\tConcreteHandlerTwo.HandleRequest : " + request.getDescription()
                    + request.getValue());
        } else {
            getSuccessor().handleRequest(request);
        }
    }
}