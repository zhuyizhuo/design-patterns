package com.yizhuo.learning.patterns.observer.proxy;

import com.yizhuo.learning.patterns.observer.core.Event;
import com.yizhuo.learning.patterns.observer.core.EventLister;
import com.yizhuo.learning.patterns.observer.mouse.MouseEventCallBack;
import com.yizhuo.learning.patterns.observer.mouse.MouseEventType;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by yizhuo on 2018/5/30.
 */
public class MouseProxy extends EventLister implements MethodInterceptor{

    private static Map<String,Enum> m = new ConcurrentHashMap();
    static {
        m.put("onClick", MouseEventType.ON_CLICK);
        m.put("onDoubleClick",MouseEventType.ON_DOUBLE_CLICK);
        m.put("onUp",MouseEventType.ON_UP);
        m.put("onDown",MouseEventType.ON_DOWN);
        m.put("onMove",MouseEventType.ON_MOVE);
        m.put("onScroll",MouseEventType.ON_SCROLL);
    }

    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        String name = method.getName();
        Enum anEnum = m.get(name);
        MouseEventCallBack mouseEventCallBack = new MouseEventCallBack();
        //这里观察者和被观察者的方法名相同  如果方法不相同  还需要加一个方法名映射
        Method callBackMethod = mouseEventCallBack.getClass().getMethod(name, new Class[]{Event.class});
        //注册事件  绑定观察者
        //如果需要通知多个观察者 则需要绑定多个lister
        addLister(anEnum, mouseEventCallBack, callBackMethod,objects);

        //执行方法
        methodProxy.invokeSuper(o, objects);

        //通知观察者
        trigger(anEnum);
        return null;
    }
}
