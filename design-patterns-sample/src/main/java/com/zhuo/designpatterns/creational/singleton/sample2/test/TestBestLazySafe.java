package com.zhuo.designpatterns.creational.singleton.sample2.test;

import java.util.concurrent.CountDownLatch;

import com.zhuo.designpatterns.creational.singleton.sample2.lazy.BestLazy;

/**
 * 类: LazyTestThread <br>
 * 描述: 懒汉式线程非安全测试  <br>
 * 作者: yizhuo <br>
 * 时间: 2018年5月4日 下午1:02:58
 */
public class TestBestLazySafe {

	public static void main(String[] args) {
		useCountDownTest();
	}

	private static void useCountDownTest() {
		int count = 100;
		//
		final CountDownLatch c = new CountDownLatch(count);
		for (int i = 0; i < count; i++) {
			Thread thread = new Thread() {
				@Override
				public void run() {
					try {
						c.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					BestLazy instance = BestLazy.getInstance();
					System.out.println(instance);
				}
			};
			thread.start();
			c.countDown();
		}
	}
}
