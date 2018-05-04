package com.yizhuo.learning.patterns.factory.func;

import com.yizhuo.learning.patterns.factory.Computer;
import com.yizhuo.learning.patterns.factory.Dell;

public class DellFactory implements Factory{

	public Computer getComputer() {
		return new Dell();
	}
	
}
