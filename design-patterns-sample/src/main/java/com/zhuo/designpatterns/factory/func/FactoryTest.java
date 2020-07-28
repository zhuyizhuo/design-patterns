package com.zhuo.designpatterns.factory.func;

import com.zhuo.designpatterns.factory.Computer;

/**
 * @author zhuo
 */
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
