package com.zhuo.designpatterns.creational.factorymethod;

/**
 * 动机(Motivation):
    在软件系统中，由于需求的变化，"这个对象的具体实现"经常面临着剧烈的变化，但它却有比较稳定的接口。
    如何应对这种变化呢？提供一种封装机制来隔离出"这个易变对象"的变化，从而保持系统中"其它依赖的对象"不随需求的变化而变化。
意图(Intent):
    定义一个用户创建对象的接口，让子类决定实例哪一个类。Factory Method使一个类的实例化延迟到子类。
                                                            ----------《设计模式》GOF
                                                            适用性：
    1.当一个类不知道它所必须创建的对象类的时候。
    2.当一个类希望由它子类来指定它所创建对象的时候。
    3.当类将创建对象的职责委托给多个帮助子类中的某个，并且你希望将哪一个帮助子类是代理者这一信息局部化的时候。
 * @author zhuo
 *
 */
//简单工厂
public class Test
{
	public static void main(String[] args)
	{
		//产生接口的对象,此时不再需要知道调用那一个子类,解决了耦合问题
		Car f= CarFactory.getCarInstance(2);
		f.make();
	}
}

interface Car {
	//造汽车
	public void make();
}

class Qq implements Car
{
	public void make() {
		System.out.println("造QQ");
	}

}

class Bmw implements Car
{
	public void make() {
		System.out.println("造宝马");

	}
}

class CarFactory
{
	public static Car getCarInstance(int i)
	{
		Car f=null;
		if(i==1)
		{
			//i==1,认为是qq
			f=new Qq();
		}
		if(i==2)
		{
			//i==2,认为是bwm
			f=new Bmw();
		}
		//否则不实例化
		return f;
	}
}