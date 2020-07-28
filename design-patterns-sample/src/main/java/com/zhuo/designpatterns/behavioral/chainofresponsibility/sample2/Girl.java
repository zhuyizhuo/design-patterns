package com.zhuo.designpatterns.behavioral.chainofresponsibility.sample2;

/**
 * @author zhuo
 */
public class Girl {

	public static void main(String[] args) {
		/** 这个 boy 没有车，也没有房，不过很有责任心 */
		Boy boy = new Boy(false, false, true);
		/** 也可以使用 setHanlder 方法 */
		Handler handler = new CarHandler(new HouseHandler(new ResponsibilityHandler(null)));
		handler.handleRequest(boy);
	}
}
