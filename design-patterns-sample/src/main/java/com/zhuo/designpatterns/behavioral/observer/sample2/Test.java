package com.zhuo.designpatterns.behavioral.observer.sample2;

import com.zhuo.designpatterns.behavioral.observer.sample2.mouse.Mouse;
import com.zhuo.designpatterns.behavioral.observer.sample2.proxy.MouseProxy;

/**
 *
 * @author zhuo
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
