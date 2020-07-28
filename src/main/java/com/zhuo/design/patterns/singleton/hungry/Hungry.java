package com.zhuo.design.patterns.singleton.hungry;

public class Hungry {

	private static final Hungry instance = new Hungry();
	
	private Hungry() {
	}
	
	public static Hungry getInstance() {
		return instance;
	}
	
	public void print(){
		System.out.println("饿汉式 ... 绝对线程安全..");
	}
}
