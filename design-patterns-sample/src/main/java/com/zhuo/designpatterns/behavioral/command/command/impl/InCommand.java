package com.zhuo.designpatterns.behavioral.command.command.impl;

import com.zhuo.designpatterns.behavioral.command.command.CommandInterface;


public class InCommand implements CommandInterface {

	 /**
	  * 具体的命令执行内容
	  */
	 @Override
	 public void excute() {
	    System.out.println("int command");
	 }

}