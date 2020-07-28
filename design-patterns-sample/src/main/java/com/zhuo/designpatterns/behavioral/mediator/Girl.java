package com.zhuo.designpatterns.behavioral.mediator;

/**
 * @author zhuo
 */
public class Girl extends Participant{

	public Girl(String name) {
		super(name);
	}

	@Override
	public void Receive(String from, String message){
		System.out.print("To a Girl:");
		super.Receive(from, message);
	}

}
