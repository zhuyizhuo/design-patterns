package com.zhuo.design.patterns.factory.func;

import com.zhuo.design.patterns.factory.Computer;
import com.zhuo.design.patterns.factory.Dell;

/**
 * @author zhuo
 */
public class DellFactory implements Factory{

	public Computer getComputer() {
		return new Dell();
	}
	
}
