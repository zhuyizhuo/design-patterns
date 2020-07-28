package com.zhuo.designpatterns.singleton.hungry;

public class HungryTest {

	public static void main(String[] args) {
		Hungry instance = Hungry.getInstance();
		instance.print();
	}
}
