package com.zhuo.designpatterns.factory.func;

import com.zhuo.designpatterns.factory.Computer;
import com.zhuo.designpatterns.factory.Lenovo;

/**
 * @author zhuo
 */
public class LenovoFactory implements Factory{

	public Computer getComputer() {
		return new Lenovo();
	}
	
}
