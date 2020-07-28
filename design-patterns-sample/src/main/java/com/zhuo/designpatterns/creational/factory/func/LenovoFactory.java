package com.zhuo.designpatterns.creational.factory.func;

import com.zhuo.designpatterns.creational.factory.Computer;
import com.zhuo.designpatterns.creational.factory.Lenovo;

/**
 * @author zhuo
 */
public class LenovoFactory implements Factory{

	public Computer getComputer() {
		return new Lenovo();
	}
	
}
