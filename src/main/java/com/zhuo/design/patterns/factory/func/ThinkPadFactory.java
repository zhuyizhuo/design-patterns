package com.zhuo.design.patterns.factory.func;

import com.zhuo.design.patterns.factory.Computer;
import com.zhuo.design.patterns.factory.ThinkPad;

/**
 * @author zhuo
 */
public class ThinkPadFactory implements Factory{

	public Computer getComputer() {
		return new ThinkPad();
	}
	
}
