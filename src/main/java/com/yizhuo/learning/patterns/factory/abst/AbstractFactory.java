package com.yizhuo.learning.patterns.factory.abst;

import com.yizhuo.learning.patterns.factory.Computer;

public abstract class AbstractFactory {

	public abstract Computer getDell();
	
	public abstract Computer getThinkPad();
	
	public abstract Computer getLenovo();
	
	public abstract Computer getHp();
	
}
