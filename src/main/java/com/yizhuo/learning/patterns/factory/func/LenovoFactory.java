package com.yizhuo.learning.patterns.factory.func;

import com.yizhuo.learning.patterns.factory.Computer;
import com.yizhuo.learning.patterns.factory.Lenovo;

/**
 * @author zhuo
 */
public class LenovoFactory implements Factory{

	public Computer getComputer() {
		return new Lenovo();
	}
	
}
