package com.zhuo.design.patterns.factory.abst;

import com.zhuo.design.patterns.factory.Computer;

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
