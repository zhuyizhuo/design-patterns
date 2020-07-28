package com.zhuo.designpatterns.behavioral.chainofresponsibility.sample3;

/**
 * @author zhuo
 */
public abstract class Handler {
    /**
     * 持有下一个处理节点
     */
    protected Handler successor;

    /**
     * 这个方法是具体的请求处理方法
     * @param request 请求参数
     */
    public abstract void handleRequest(Request request);

    public void nextHandle(Request request){
        if (getSuccessor() == null){
            // 此处可抛出异常
            return;
        }
        getSuccessor().handleRequest(request);
    }

    /**
     * 取出下一个节点的方法
     */
    public Handler getSuccessor() {
        return successor;
    }

    /**
     * 赋值下一个节点的方法
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}