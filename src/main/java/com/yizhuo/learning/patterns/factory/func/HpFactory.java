package com.yizhuo.learning.patterns.factory.func;

import com.yizhuo.learning.patterns.factory.Computer;
import com.yizhuo.learning.patterns.factory.Hp;

public class HpFactory implements Factory{

	public Computer getComputer() {
		return new Hp();
	}
	
}
