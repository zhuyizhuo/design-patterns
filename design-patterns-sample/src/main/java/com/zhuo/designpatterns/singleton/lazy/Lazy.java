package com.zhuo.designpatterns.singleton.lazy;

//懒汉式单例
public class Lazy {
	
	private static Lazy instance ; 
	private Lazy() {
	}	
	
	public static Lazy getInstance() {
		//线程非安全
		if (instance == null) {
			instance = new Lazy();
		}
		return instance;
	}
	
	public void print(){
		System.out.println("最简单的懒汉式 ...  线程非安全...");
	}
	
}
