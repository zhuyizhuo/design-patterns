package com.zhuo.design.patterns.singleton.hungry;

public class HungryTest {

	public static void main(String[] args) {
		Hungry instance = Hungry.getInstance();
		instance.print();
	}
}
