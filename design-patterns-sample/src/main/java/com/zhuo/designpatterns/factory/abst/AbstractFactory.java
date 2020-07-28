package com.zhuo.designpatterns.factory.abst;

import com.zhuo.designpatterns.factory.Computer;

/**
 * @author zhuo
 */
public abstract class AbstractFactory {

	public abstract Computer getDell();
	
	public abstract Computer getThinkPad();
	
	public abstract Computer getLenovo();
	
	public abstract Computer getHp();
	
}
