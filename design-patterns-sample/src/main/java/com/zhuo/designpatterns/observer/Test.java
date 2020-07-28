package com.zhuo.designpatterns.observer;

import com.zhuo.designpatterns.observer.mouse.Mouse;
import com.zhuo.designpatterns.observer.proxy.MouseProxy;

/**
 *
 * @author yizhuo
 * @date 2018/5/30
 */
public class Test {

    public static void main(String[] args) {
        Mouse mouse = (Mouse) new MouseProxy().getInstance(Mouse.class);
        mouse.onClick();
        mouse.onDoubleClick();
        mouse.onDown();
    }
}
