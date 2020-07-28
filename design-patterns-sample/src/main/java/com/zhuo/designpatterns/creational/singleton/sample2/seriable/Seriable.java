package com.zhuo.designpatterns.creational.singleton.sample2.seriable;

import java.io.Serializable;

/**
 * 类: Seriable <br>
 *   反序列化时导致单例破坏 
 * 时间: 2018年5月4日 下午4:26:49
 */
public class Seriable implements Serializable{

	private static final long serialVersionUID = 1L;

	private Seriable() {
	}
	private static final Seriable instance = new Seriable();
	
	public static Seriable getInstance(){
		return instance;
	}
	
	//添加这个方法防止反序列化对单例造成破坏
	private Object readResolve() {
		return instance;
	}
	  
}
