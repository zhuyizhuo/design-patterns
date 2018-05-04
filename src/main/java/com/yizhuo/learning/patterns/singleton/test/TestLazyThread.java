package com.yizhuo.learning.patterns.singleton.test;

import java.util.concurrent.CountDownLatch;

import com.yizhuo.learning.patterns.singleton.lazy.Lazy;

/**
 * 类: LazyTestThread <br>
 * 描述: 懒汉式线程非安全测试  <br>
 * 作者: yizhuo <br>
 * 时间: 2018年5月4日 下午1:02:58
 */
public class TestLazyThread {

	public static void main(String[] args) {
		useCountDownTest();
		
//		test();
	}

	//懒汉式单例   线程非安全测试
	private static void test() {
		for (int i = 0; i < 50; i++) {
			Thread thread = new Thread() {
				@Override
				public void run() {
					Lazy instance = Lazy.getInstance();
					System.out.println(instance);
				}
			};
			thread.start();
		}
	}

	/**
	 * 
	 * CountDownLatch在实时系统中的使用场景 

		让我们尝试罗列出在java实时系统中CountDownLatch都有哪些使用场景。我所罗列的都是我所能想到的。
		
		1. 实现最大的并行性：有时我们想同时启动多个线程，实现最大程度的并行性。
			例如，我们想测试一个单例类。如果我们创建一个初始计数为1的CountDownLatch，并让所有线程都在这个锁上等待，那么我们可以很轻松地完成测试。
			我们只需调用 一次countDown()方法就可以让所有的等待线程同时恢复执行。  即本例所使用情况.使用CountDownLatch使并发最大  更容易复现验证 出线程非安全.
		2.开始执行前等待n个线程完成各自任务：例如应用程序启动类要确保在处理用户请求前，所有N个外部系统已经启动和运行了。
		3.死锁检测：一个非常方便的使用场景是，你可以使用n个线程访问共享资源，在每次测试阶段的线程数目是不同的，并尝试产生死锁。
		
	 * 方法: useCountDownTest <br>
	 */
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
					Lazy instance = Lazy.getInstance();
					System.out.println(instance);
				}
			};
			thread.start();
			c.countDown();
		}
	}
}
