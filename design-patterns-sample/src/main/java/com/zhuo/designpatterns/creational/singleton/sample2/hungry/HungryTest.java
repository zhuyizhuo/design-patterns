package com.zhuo.designpatterns.creational.singleton.sample2.hungry;

public class HungryTest {

	public static void main(String[] args) {
		Hungry instance = Hungry.getInstance();
		instance.print();
	}
}
