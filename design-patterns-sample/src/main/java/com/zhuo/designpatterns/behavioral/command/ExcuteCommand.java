package com.zhuo.designpatterns.behavioral.command;

import com.zhuo.designpatterns.behavioral.command.command.CommandInterface;

//封装接口的实现
public class ExcuteCommand {
	private CommandInterface InCommand,OutCommand ;
	
	public ExcuteCommand(CommandInterface inCommand, CommandInterface outCommand) {
		InCommand = inCommand;
		OutCommand = outCommand;
	}

	public void execIn() {
		InCommand.excute();
	}

	public void execOut() {
		OutCommand.excute();
	}
}
