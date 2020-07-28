package com.zhuo.design.patterns.singleton.test;

import com.zhuo.design.patterns.singleton.lazy.Lazy;

public class LazyTest {

	public static void main(String[] args) {
		
		Lazy instance = Lazy.getInstance();
		instance.print();
		
	}
}
