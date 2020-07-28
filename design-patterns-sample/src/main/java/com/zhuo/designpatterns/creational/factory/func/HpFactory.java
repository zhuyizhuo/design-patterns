package com.zhuo.designpatterns.creational.factory.func;

import com.zhuo.designpatterns.creational.factory.Computer;
import com.zhuo.designpatterns.creational.factory.Hp;

/**
 * @author zhuo
 */
public class HpFactory implements Factory{

	public Computer getComputer() {
		return new Hp();
	}
	
}
