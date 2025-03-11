package com.zhuo.designpatterns.behavioral.chainofresponsibility.sample1;

import org.apache.tools.ant.util.StringUtils;

/**
 * 具体的处理对象
 * @author zhuo
 */
public class ConcreteHandler extends Handler {

    private String name;

    public ConcreteHandler() {
    }

    public ConcreteHandler(String name) {
        this.name = name;
    }

    @Override
    public void handleRequest(Request request) {
        /**
         * 判断是否有下个节点的责任处理对象
         * 如果有，就转发请求给下一个责任处理对象
         * 如果没有，则处理请求
         */
        if (getSuccessor() != null) {
            System.out.println(getName() + "放过请求");
            getSuccessor().handleRequest(request);
        } else {
            System.out.println(getName() + "处理请求");
        }
    }

    private String getName() {
        return this.name == null ? "" : this.name;
    }
}