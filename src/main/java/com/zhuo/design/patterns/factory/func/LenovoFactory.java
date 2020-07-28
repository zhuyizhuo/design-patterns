package com.zhuo.design.patterns.factory.func;

import com.zhuo.design.patterns.factory.Computer;
import com.zhuo.design.patterns.factory.Lenovo;

/**
 * @author zhuo
 */
public class LenovoFactory implements Factory{

	public Computer getComputer() {
		return new Lenovo();
	}
	
}
