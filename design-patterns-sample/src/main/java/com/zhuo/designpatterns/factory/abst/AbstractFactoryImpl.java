package com.zhuo.designpatterns.factory.abst;

import com.zhuo.designpatterns.factory.Computer;
import com.zhuo.designpatterns.factory.Dell;
import com.zhuo.designpatterns.factory.Hp;
import com.zhuo.designpatterns.factory.Lenovo;
import com.zhuo.designpatterns.factory.ThinkPad;

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
