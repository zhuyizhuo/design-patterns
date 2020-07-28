package com.zhuo.designpatterns.factory.simple;

import com.zhuo.designpatterns.factory.Computer;

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
