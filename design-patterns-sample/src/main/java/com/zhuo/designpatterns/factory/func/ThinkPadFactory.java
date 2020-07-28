package com.zhuo.designpatterns.factory.func;

import com.zhuo.designpatterns.factory.Computer;
import com.zhuo.designpatterns.factory.ThinkPad;

/**
 * @author zhuo
 */
public class ThinkPadFactory implements Factory{

	public Computer getComputer() {
		return new ThinkPad();
	}
	
}
