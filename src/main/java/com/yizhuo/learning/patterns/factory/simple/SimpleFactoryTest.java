package com.yizhuo.learning.patterns.factory.simple;

import com.yizhuo.learning.patterns.factory.Computer;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		SimpleFactory simpleFactory = new SimpleFactory();
		Computer computer = simpleFactory.getComputer("HP");
		computer.open();	
	}
}
