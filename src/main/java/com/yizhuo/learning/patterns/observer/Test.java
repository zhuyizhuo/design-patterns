package com.yizhuo.learning.patterns.observer;

import com.yizhuo.learning.patterns.observer.mouse.Mouse;
import com.yizhuo.learning.patterns.observer.proxy.MouseProxy;

/**
 * Created by yizhuo on 2018/5/30.
 */
public class Test {

    public static void main(String[] args) {
        Mouse mouse = (Mouse) new MouseProxy().getInstance(Mouse.class);
        mouse.onClick();
        mouse.onDoubleClick();
        mouse.onDown();
    }
}
