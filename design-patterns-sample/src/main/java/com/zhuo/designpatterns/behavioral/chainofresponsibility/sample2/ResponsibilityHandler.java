package com.zhuo.designpatterns.behavioral.chainofresponsibility.sample2;

/**
 * @author zhuo
 */
public class ResponsibilityHandler implements Handler {

	private Handler handler;

	public ResponsibilityHandler(Handler handler) {
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
		if (boy.isHasResponsibility()) {
			System.out.println("我有责任心");
		} else {
			System.out.println("我没有责任心");
			handler.handleRequest(boy);
		}
	}
}
