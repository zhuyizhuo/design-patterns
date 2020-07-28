package com.zhuo.designpatterns.behavioral.chainofresponsibility.sample2;

/**
 * @author zhuo
 */
public interface Handler {
	/**
	 * 处理请求
	 * @param boy 请求参数
	 */
	void handleRequest(Boy boy);
}