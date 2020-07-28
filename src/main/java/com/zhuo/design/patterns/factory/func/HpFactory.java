package com.zhuo.design.patterns.factory.func;

import com.zhuo.design.patterns.factory.Computer;
import com.zhuo.design.patterns.factory.Hp;

/**
 * @author zhuo
 */
public class HpFactory implements Factory{

	public Computer getComputer() {
		return new Hp();
	}
	
}
