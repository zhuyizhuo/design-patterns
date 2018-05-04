package com.yizhuo.learning.patterns.singleton.test;

import com.yizhuo.learning.patterns.singleton.lazy.Lazy;

public class LazyTest {

	public static void main(String[] args) {
		
		Lazy instance = Lazy.getInstance();
		instance.print();
		
	}
}
