package com.zhuo.designpatterns.behavioral.command.command.impl;

import com.zhuo.designpatterns.behavioral.command.command.CommandInterface;


/**
 * @author zhuo
 */
public class InCommand implements CommandInterface {

	 /**
	  * 具体的命令执行内容
	  */
	 @Override
	 public void execute() {
	    System.out.println("in command");
	 }

}
