package com.zhuo.designpatterns.creational.factory.func;

import com.zhuo.designpatterns.creational.factory.Computer;
import com.zhuo.designpatterns.creational.factory.Dell;

/**
 * @author zhuo
 */
public class DellFactory implements Factory{

	public Computer getComputer() {
		return new Dell();
	}
	
}
