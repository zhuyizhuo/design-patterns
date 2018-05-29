package com.yizhuo.learning.patterns.observer.mouse;

import com.yizhuo.learning.patterns.observer.core.Event;

/**
 * Created by yizhuo on 2018/5/30.
 */
public class MouseEventCallBack {

    public void onClick(Event e) {
        System.out.println("====MouseEventCallBack Mouse onClick====\n" + e);
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
