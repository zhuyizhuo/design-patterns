package com.zhuo.designpatterns.factory.abst;

import com.zhuo.designpatterns.factory.Computer;

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
