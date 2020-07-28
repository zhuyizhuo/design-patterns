package com.zhuo.designpatterns.behavioral.mediator;

import java.util.Hashtable;

/**
 * 动机(Motivate): 在软件构建过程中，经常会出现多个对象互相关联交互的情况，对象之间常常会维持一种复杂的引用关系，如果遇到一些需求的更改，
 * 这种直接的引用关系将面临不断的变化。
 * 在这种情况下，我们可使用一个“中介对象”来管理对象间的关联关系，避免相互交互的对象之间的紧耦合引用关系，从而更好地抵御变化。
 *  
 * 意图(Intent)：
 * 用一个中介对象来封装一系列对象交互。中介者使各对象不需要相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。 ------《设计模式》GOF
 * 
 * 适用性：
    1.一组对象以定义良好但是复杂的方式进行通信。产生的相互依赖关系结构混乱且难以理解。
    2.一个对象引用其他很多对象并且直接与这些对象通信，导致难以复用该对象。
    3.想定制一个分布在多个类中的行为，而又不想生成太多的子类。
    
 Mediator实现要点：
	1.将多个对象间复杂的关联关系解耦，Mediator模式将多个对象间的控制逻辑进行集中管理，变“多个对象互相关系”为多“个对象和一个中介者关联”，简化了系统的维护，抵御了可能的变化。
	2.随着控制逻辑的复杂化，Mediator具体对象的实现可能相当复杂。 这时候可以对Mediator对象进行分解处理。
	3.Facade模式是解耦系统外到系统内(单向)的对象关系关系;Mediator模式是解耦系统内各个对象之间(双向)的关联关系。
 * @author zhuo
 * 
 */
public class Test {
	public static void main(String[] args) {
		Chatroom chatroom = new Chatroom();
		Participant George = new Beatle("George");
		Participant Paul = new Beatle("Paul");
		Participant Ringo = new Beatle("Ringo");
		Participant John = new Beatle("John");
		Participant Yoko = new NonBeatle("Yoko");
		chatroom.Register(George);
		chatroom.Register(Paul);
		chatroom.Register(Ringo);
		chatroom.Register(John);
		chatroom.Register(Yoko);
		
		//chatting participants
		Yoko.Send("John", "Hi John");
		Paul.Send("Ringo", "All you need is love");
		Ringo.Send("George", "My sweet Lord");
		Paul.Send("John", "Can't buy me love");
		John.Send("Yoko", "My sweet love");
	}
}

class Chatroom extends AbstractChatroom{

	private Hashtable participants = new Hashtable();
	
	@Override
	public void Register(Participant participant) {
		if (participants.get(participant.getName()) == null){
			participants.put(participant.getName(), participant);
		}
		participant.setChatroom(this);
	}

	@Override
	public void Send(String from, String to, String message) {
		 Participant pto = (Participant)participants.get(to);
		 if (pto != null){
			 pto.Receive(from, message);
		 }
	}
	
}

class Participant{
	private Chatroom chatroom;
	private String name;
	
	public Participant(String name) {
		super();
		this.name = name;
	}
	public Chatroom getChatroom() {
		return chatroom;
	}
	public void setChatroom(Chatroom chatroom) {
		this.chatroom = chatroom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void Send(String to, String message){
		chatroom.Send(name, to, message);
	}
	public void Receive(String from, String message){
		System.out.println(from +" to " + name +":'" + message + "'");
	}
}

class Beatle extends Participant{

	public Beatle(String name) {
		super(name);
	}

	@Override
	public void Receive(String from, String message){
		System.out.print("To a Beatle:");
		super.Receive(from, message);
	}

}

class NonBeatle extends Participant{

	public NonBeatle(String name) {
		super(name);
	}

	@Override
	public void Receive(String from, String message){
		System.out.print("To a non-Beatle:");
		super.Receive(from, message);
	}

}
