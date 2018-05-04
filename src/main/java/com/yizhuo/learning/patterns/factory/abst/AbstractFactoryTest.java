package com.yizhuo.learning.patterns.factory.abst;

import com.yizhuo.learning.patterns.factory.Computer;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory abstractFactoryImpl = new AbstractFactoryImpl();
		Computer dell = abstractFactoryImpl.getHp();
		dell.open();
	}
}
