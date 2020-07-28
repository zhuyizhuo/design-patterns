package com.zhuo.designpatterns.creational.factory.abst;

import com.zhuo.designpatterns.creational.factory.Computer;
import com.zhuo.designpatterns.creational.factory.Dell;
import com.zhuo.designpatterns.creational.factory.Hp;
import com.zhuo.designpatterns.creational.factory.Lenovo;
import com.zhuo.designpatterns.creational.factory.ThinkPad;

/**
 * @author zhuo
 */
public class AbstractFactoryImpl extends AbstractFactory{

	@Override
	public Computer getDell() {
		return new Dell();
	}

	@Override
	public Computer getThinkPad() {
		return new ThinkPad();
	}

	@Override
	public Computer getLenovo() {
		return new Lenovo();
	}

	@Override
	public Computer getHp() {
		return new Hp();
	}

}
