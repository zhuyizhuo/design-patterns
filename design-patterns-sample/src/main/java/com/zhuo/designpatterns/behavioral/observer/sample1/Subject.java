package com.zhuo.designpatterns.behavioral.observer.sample1;

import java.util.Observable;
import java.util.Observer;

/**
 * 动机(Motivate):
    在软件构建过程中，我们需要为某些对象建立一种“通知依赖关系” --------一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知。如果这样的依赖关系过于紧密，将使软件不能很好地抵御变化。使用面向对象技术，可以将这种依赖关系弱化，并形成一种稳定的依赖关系。从而实现软件体系结构的松耦合。
意图(Intent):
    定义对象间的一种一对多的依赖关系,当一个对象的状态发生改变时, 所有依赖于它的对象都得到通知并被自动更新。
                                                                         -------《设计模式》GOF

           适用性：
1．当一个抽象模型有两个方面, 其中一个方面依赖于另一方面。将这二者封装在独立的对象中以使它们可以各自独立地改变和复用。
2．当对一个对象的改变需要同时改变其它对象, 而不知道具体有多少对象有待改变。
3．当一个对象必须通知其它对象，而它又不能假定其它对象是谁。换言之, 你不希望这些对象是紧密耦合的。

 * @author zhuo
 */
public class Subject extends Observable{
	
	/**
	 * 业务方法，一旦执行某个操作，则通知观察者
	 */
	public void doBusiness(){
		if (true) {
			super.setChanged();
		}
		notifyObservers("现在还没有的参数");
	}

	
	public static void main(String [] args) {
		//创建一个被观察者
		Subject subject = new Subject();
		
		//创建两个观察者
		Observer mailObserver = new MailObserver();
		Observer jmsObserver = new JMSObserver();
		
		//把两个观察者加到被观察者列表中
		subject.addObserver(mailObserver);
		subject.addObserver(jmsObserver);
		
		//执行业务操作
		subject.doBusiness();
	}
}
