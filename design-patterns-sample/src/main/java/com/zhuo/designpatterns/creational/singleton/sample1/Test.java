package com.zhuo.designpatterns.creational.singleton.sample1;


import java.util.HashMap;

public class Test
{
	public static void main(String[] args)
	{
		SingletonTest t = SingletonTest.getInstance();
		t.test();
	}
}

/**
 * 饿汉式单例模式
 */
class SingletonTest
{
	private static final SingletonTest st =
		new SingletonTest();

	private SingletonTest(){}

	public static SingletonTest getInstance()
	{
		return st;
	}
	public void test()
	{
		System.out.println("fffffffffff");
	}
}

/**
 * 懒汉式单例模式
 */
class LazySingleton
{
	private static LazySingleton ls = null;

	private LazySingleton(){}

	synchronized public static LazySingleton getInstance()
	{
		if (ls == null)
		{
			ls = new LazySingleton();
		}
		return ls;
	}
}

/**
 * 登记式单例类
 */
class RegSingleton
{
	static private HashMap map = new HashMap();
	static
	{
		RegSingleton x = new RegSingleton();
		map.put(x.getClass().getName(), x);
	}
	protected RegSingleton(){}

	static public RegSingleton getInstance(String name)
	{
		if (name == null)
		{
			name = "RegSingleton";
		}
		if (map.get(name) == null)
		{
			try
			{
				map.put(name,Class.forName(name).newInstance());
			}
			catch (Exception e)
			{
				System.out.print("异常");
			}

		}
		return (RegSingleton) map.get(name);
	}
}