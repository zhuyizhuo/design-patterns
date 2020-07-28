package com.zhuo.design.patterns.factory.abst;

import com.zhuo.design.patterns.factory.Computer;
import com.zhuo.design.patterns.factory.Dell;
import com.zhuo.design.patterns.factory.Hp;
import com.zhuo.design.patterns.factory.Lenovo;
import com.zhuo.design.patterns.factory.ThinkPad;

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
