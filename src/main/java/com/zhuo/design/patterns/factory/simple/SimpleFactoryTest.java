package com.zhuo.design.patterns.factory.simple;

import com.zhuo.design.patterns.factory.Computer;

/**
 * @author zhuo
 */
public class SimpleFactoryTest {

	public static void main(String[] args) {
		SimpleFactory simpleFactory = new SimpleFactory();
		Computer computer = simpleFactory.getComputer("HP");
		computer.open();	
	}
}
