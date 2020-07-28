package com.zhuo.designpatterns.behavioral.mediator;

/**
 * @author zhuo
 */
public abstract class AbstractChatroom {
    /** 注册 */
    public abstract void register(Participant participant);
    /** 发消息 */
    public abstract void send(String from, String to, String message);
}
