package com.yizhuo.learning.patterns.singleton.test;

import java.lang.reflect.Constructor;

import com.yizhuo.learning.patterns.singleton.lazy.BestLazy;

public class TestBestLazy {

	//非常无聊的情况下 用反射破坏单例
	public static void main(String[] args) {
		try {
			Constructor<BestLazy> declaredConstructor = BestLazy.class.getDeclaredConstructor();
			declaredConstructor.setAccessible(true);
			BestLazy newInstance = declaredConstructor.newInstance();
			BestLazy newInstance2 = declaredConstructor.newInstance();
			
			System.out.println(newInstance == newInstance2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
