package com.zhuo.design.patterns.factory.simple;

import com.zhuo.design.patterns.factory.Computer;
import com.zhuo.design.patterns.factory.Dell;
import com.zhuo.design.patterns.factory.Hp;
import com.zhuo.design.patterns.factory.Lenovo;
import com.zhuo.design.patterns.factory.ThinkPad;

/**
 * @author zhuo
 */
public class SimpleFactory {

	public Computer getComputer(String name){
		if ("DELL".equals(name)) {
			return new Dell();
		}else if("LENOVO".equals(name)){
			return new Lenovo();
		}else if("THINKPAD".equals(name)){
			return new ThinkPad();
		}else if("HP".equals(name)){
			return new Hp();
		}else{
			System.out.println("你所需要的电脑品牌本工厂不生产...");
		}
		return null;
	}
	
}
