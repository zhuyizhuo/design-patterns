package com.yizhuo.learning.patterns.factory.abst;

import com.yizhuo.learning.patterns.factory.Computer;
import com.yizhuo.learning.patterns.factory.Dell;
import com.yizhuo.learning.patterns.factory.Hp;
import com.yizhuo.learning.patterns.factory.Lenovo;
import com.yizhuo.learning.patterns.factory.ThinkPad;

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
