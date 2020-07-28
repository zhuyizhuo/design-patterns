package com.zhuo.designpatterns.behavioral.mediator;

/**
 * @author zhuo
 */
public class Boy extends Participant{

	public Boy(String name) {
		super(name);
	}

	@Override
	public void Receive(String from, String message){
		System.out.print("To a Boy:");
		super.Receive(from, message);
	}

}
