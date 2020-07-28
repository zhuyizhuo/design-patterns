package com.zhuo.designpatterns.factory.func;

import com.zhuo.designpatterns.factory.Computer;
import com.zhuo.designpatterns.factory.Dell;

/**
 * @author zhuo
 */
public class DellFactory implements Factory{

	public Computer getComputer() {
		return new Dell();
	}
	
}
