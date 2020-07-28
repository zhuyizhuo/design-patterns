package com.zhuo.designpatterns.observer.mouse;

import com.alibaba.fastjson.JSON;
import com.zhuo.designpatterns.observer.core.Event;

/**
 *
 * @author yizhuo
 * @date 2018/5/30
 */
public class MouseEventCallBack {

    public void onClick(Event e) {
        System.out.println("====MouseEventCallBack Mouse onClick====\n" + JSON.toJSONString(e));
    }

    public void onDoubleClick(Event e) {
        System.out.println("====MouseEventCallBack Mouse onDoubleClick====\n" + e);
    }

    public void onMove(Event e) {
        System.out.println("====MouseEventCallBack Mouse onMove====\n" + e);
    }

    public void onUp(Event e) {
        System.out.println("====MouseEventCallBack Mouse onUp====\n" + e);
    }

    public void onDown(Event e) {
        System.out.println("====MouseEventCallBack Mouse onDown====\n" + e);
    }

    public void onScroll(Event e) {
        System.out.println("====MouseEventCallBack Mouse onScroll====\n" + e);
    }
}
