package com.zhuo.designpatterns.behavioral.chainofresponsibility.sample3;

/**
 * 具体的处理对象
 *
 * @author zhuo
 */
public class ConcreteHandlerThree extends Handler {
    @Override
    public void handleRequest(Request request) {
        //if request is eligible handle it
        if (request.getValue() >= 0) {
            System.out.println("Zero values are handled by ConcreteHandlerThree:");
            System.out.println("\tConcreteHandlerThree.HandleRequest : " + request.getDescription()
                    + request.getValue());
        } else {
            super.nextHandle(request);
        }
    }
}