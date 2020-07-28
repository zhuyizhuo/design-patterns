package com.zhuo.designpatterns.creational.factory.func;

import com.zhuo.designpatterns.creational.factory.Computer;
import com.zhuo.designpatterns.creational.factory.ThinkPad;

/**
 * @author zhuo
 */
public class ThinkPadFactory implements Factory{

	public Computer getComputer() {
		return new ThinkPad();
	}
	
}
