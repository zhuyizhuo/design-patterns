package com.yizhuo.learning.patterns.singleton.register;

import java.util.HashMap;
import java.util.Map;

public class RegSingleton {
	
	private static Map<String,RegSingleton> map = new HashMap<String,RegSingleton>(); 
	
	private RegSingleton() {
		
	}
	
	public static RegSingleton getInstance(String name){
		if (name == null || name.trim().length() == 0) {
			name = RegSingleton.class.getName();
		}
		if (map.get(name) == null) {
			map.put(name, new RegSingleton());
		}
		return map.get(name);
	}
	
}
