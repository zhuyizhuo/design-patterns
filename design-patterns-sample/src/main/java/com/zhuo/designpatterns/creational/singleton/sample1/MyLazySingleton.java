package com.zhuo.designpatterns.creational.singleton.sample1;

/**
 * 懒汉式单例模式
 */
public class MyLazySingleton {
	private static String[] ls = null;

	private MyLazySingleton() {
	}

	public static String[] getInstance() {
		if (ls == null) {
			synchronized (MyLazySingleton.class) {
				if (ls == null) {
					String s = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16";
					ls = s.split(",");
				}
			}
		}
		return ls;
	}
}