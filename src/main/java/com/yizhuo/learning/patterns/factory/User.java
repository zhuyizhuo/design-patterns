package com.yizhuo.learning.patterns.factory;

public class User {

	public static void main(String[] args) {
		Dell dell = new Dell();
		dell.open();
		
		Hp hp = new Hp();
		hp.open();
	}
	
}
