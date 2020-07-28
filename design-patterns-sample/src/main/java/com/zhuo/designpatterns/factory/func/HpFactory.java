package com.zhuo.designpatterns.factory.func;

import com.zhuo.designpatterns.factory.Computer;
import com.zhuo.designpatterns.factory.Hp;

/**
 * @author zhuo
 */
public class HpFactory implements Factory{

	public Computer getComputer() {
		return new Hp();
	}
	
}
