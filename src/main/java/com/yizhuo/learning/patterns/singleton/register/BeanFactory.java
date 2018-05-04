package com.yizhuo.learning.patterns.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

	private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
	private BeanFactory() {
	}
	
	public static Object getBean(String beanName){
		if (!ioc.containsKey(beanName)) {
			Object newInstance = null;
			try {
				newInstance = Class.forName(beanName).newInstance();
				ioc.put(beanName, newInstance);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return newInstance;
		} else{
			return ioc.get(beanName);
		}
	}
	
}
