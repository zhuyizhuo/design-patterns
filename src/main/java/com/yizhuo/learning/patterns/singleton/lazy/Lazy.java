package com.yizhuo.learning.patterns.singleton.lazy;

public class Lazy {
	
	private static Lazy instance ; 
	private Lazy() {
		// TODO Auto-generated constructor stub
	}	
	
	public static Lazy getInstance() {
		if (instance == null) {
			instance = new Lazy();
		}
		return instance;
	}
	
	public void print(){
		System.out.println("懒汉式 ...  线程非安全...");
	}
	
}
