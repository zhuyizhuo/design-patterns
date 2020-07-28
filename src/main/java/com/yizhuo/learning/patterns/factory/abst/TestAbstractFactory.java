package com.yizhuo.learning.patterns.factory.abst;

import com.yizhuo.learning.patterns.factory.Computer;

/**
 * @author zhuo
 */
public class TestAbstractFactory {

	public static void main(String[] args) {
		AbstractFactory abstractFactoryImpl = new AbstractFactoryImpl();
		Computer computer = abstractFactoryImpl.getHp();
		computer.open();
	}
}
