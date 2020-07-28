package com.zhuo.designpatterns.creational.factory.simple;

import com.zhuo.designpatterns.creational.factory.Computer;

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
