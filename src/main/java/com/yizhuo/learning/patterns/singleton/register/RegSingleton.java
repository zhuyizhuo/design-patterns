package com.yizhuo.learning.patterns.singleton.register;

import java.util.HashMap;
import java.util.Map;

public class RegSingleton {
	
	private static Map<String,RegSingleton> map = new HashMap<String,RegSingleton>(); 
	
	private RegSingleton() {
		
	}
	
	
}
