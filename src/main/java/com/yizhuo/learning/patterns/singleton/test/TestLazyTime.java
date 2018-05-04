package com.yizhuo.learning.patterns.singleton.test;

import com.yizhuo.learning.patterns.singleton.lazy.BestLazy;
import com.yizhuo.learning.patterns.singleton.lazy.LazyThreadSafe;

public class TestLazyTime {

	public static void main(String[] args) {
		int count = 40000000;
		testLazyThreadSafeTime(count);
		
		testBestLazyTime(count);
		
		System.out.println("count越大 两者差别越大");
	}

	//测试最牛B单例执行时间
	private static void testBestLazyTime(int count) {
		long currentTimeMillis = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			BestLazy instance = BestLazy.getInstance();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("BestLazy耗时:" + (endTime-currentTimeMillis));
	}

	/** 
	 * 方法: testLazyThreadSafeTime <br>
	 * 测试synchronized 单例执行时间
	 */
	private static void testLazyThreadSafeTime(int count) {
		long currentTimeMillis = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			LazyThreadSafe instance = LazyThreadSafe.getInstance();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("LazyThreadSafe耗时:" + (endTime-currentTimeMillis));
	}
}
