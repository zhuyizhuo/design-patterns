package com.yizhuo.learning.patterns.singleton.lazy;

/**
 * 类: LazyThreadSafeTest <br>
 * 描述: 懒汉式线程非安全测试  <br>
 * 作者: 朱一卓 <br>
 * 时间: 2018年5月4日 下午1:02:58
 */
public class LazyThreadSafeTest {

	public static void main(String[] args) {
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
}
