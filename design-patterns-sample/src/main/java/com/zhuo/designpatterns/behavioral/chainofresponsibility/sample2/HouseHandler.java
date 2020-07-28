package com.zhuo.designpatterns.behavioral.chainofresponsibility.sample2;

/**
 * @author zhuo
 */
public class HouseHandler implements Handler {

	private Handler handler;

	public HouseHandler(Handler handler) {

		this.handler = handler;
	}

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void handleRequest(Boy boy) {
		if (boy.isHasHouse()) {
			System.out.println("没想到吧，我还有房子");
		} else {
			System.out.println("我没有房");
			handler.handleRequest(boy);
		}
	}
}
