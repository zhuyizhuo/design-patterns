package com.zhuo.designpatterns.singleton.test;

import com.zhuo.designpatterns.singleton.lazy.Lazy;

public class LazyTest {

	public static void main(String[] args) {
		
		Lazy instance = Lazy.getInstance();
		instance.print();
		
	}
}
