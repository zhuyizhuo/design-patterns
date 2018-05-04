package com.yizhuo.learning.patterns.singleton.lazy;

public class LazyTest {

	public static void main(String[] args) {
		
		Lazy instance = Lazy.getInstance();
		instance.print();
		
	}
}
