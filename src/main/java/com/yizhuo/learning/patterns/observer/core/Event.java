package com.yizhuo.learning.patterns.observer.core;

import java.lang.reflect.Method;

/**
 * Created by yizhuo on 2018/5/30.
 */
public class Event {
    //事件源
    private Object source;
    //通知目标
    private Object target;
    //回调
    private Method callBack;
    //触发
    private String trigger;
    //触发时间
    private long time;

    private Object args;

    public Object getArgs() {
        return args;
    }

    public void setArgs(Object args) {
        this.args = args;
    }

    public Event(Object target, Method callBack) {
        this.target = target;
        this.callBack = callBack;
    }

    public Event(Object target, Method callBack, Object args) {
        this.target = target;
        this.callBack = callBack;
        this.args = args;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallBack() {
        return callBack;
    }

    public void setCallBack(Method callBack) {
        this.callBack = callBack;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callBack=" + callBack +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                ", args=" + args +
                '}';
    }
}
