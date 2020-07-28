package com.zhuo.designpatterns.creational.singleton.sample2.test;

import com.zhuo.designpatterns.creational.singleton.sample2.lazy.Lazy;

public class LazyTest {

	public static void main(String[] args) {
		
		Lazy instance = Lazy.getInstance();
		instance.print();
		
	}
}
