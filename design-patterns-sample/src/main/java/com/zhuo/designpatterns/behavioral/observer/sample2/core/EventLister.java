package com.zhuo.designpatterns.behavioral.observer.sample2.core;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author zhuo
 * @date 2018/5/30
 */
@SuppressWarnings("rawtypes")
public class EventLister {
    /** 时间注册器 */
	protected Map<Enum,Event> events = new ConcurrentHashMap<Enum, Event>();

    public void addLister(Enum eventType,Object target,Method callback){
        this.addLister(eventType,target,callback,null);
    }

    public void addLister(Enum eventType,Object target,Method callback,Object[] args){
        events.put(eventType,new Event(target,callback,args));
    }

    private void trigger(Event e){
        e.setSource(this);
        e.setTime(System.currentTimeMillis());
        try {
            e.getCallBack().invoke(e.getTarget(),e);
        }catch (Exception e1){
            e1.printStackTrace();
        }
    }

    protected void trigger(Enum call){
        if (!this.events.containsKey(call)){
            return;
        }
        trigger(this.events.get(call).setTrigger(call.toString()));
    }

}
