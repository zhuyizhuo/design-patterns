package com.zhuo.designpatterns.behavioral.observer.sample1;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhuo
 */
public class JMSObserver implements Observer{

	public void update(Observable o, Object arg) {
		System.out.println("发送消息给jms服务器的观察者已经被执行");
	}
}
