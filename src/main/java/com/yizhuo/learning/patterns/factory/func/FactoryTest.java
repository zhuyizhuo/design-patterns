package com.yizhuo.learning.patterns.factory.func;

import com.yizhuo.learning.patterns.factory.Computer;

public class FactoryTest {

	public static void main(String[] args) {
//		DellFactory dellFactory = new DellFactory();
//		Computer computer = dellFactory.getComputer();
//		computer.open();
		
		HpFactory dellFactory = new HpFactory();
		Computer computer = dellFactory.getComputer();
		computer.open();
	}
}
