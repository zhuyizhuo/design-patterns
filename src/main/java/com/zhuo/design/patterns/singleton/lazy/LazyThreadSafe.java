package com.zhuo.design.patterns.singleton.lazy;

//线程安全 但是性能太低
public class LazyThreadSafe {
	private static LazyThreadSafe instance ;

	private LazyThreadSafe() {
	}
	
	public synchronized static LazyThreadSafe getInstance() {
		if (instance == null) {
			instance = new LazyThreadSafe();
		}
		return instance;
	}
}
