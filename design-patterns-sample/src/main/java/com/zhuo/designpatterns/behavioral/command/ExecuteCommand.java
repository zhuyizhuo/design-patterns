package com.zhuo.designpatterns.behavioral.command;

import com.zhuo.designpatterns.behavioral.command.command.CommandInterface;

/**
 * 封装接口的实现
 * @author zhuo
 */
public class ExecuteCommand {
	private CommandInterface InCommand;
	private CommandInterface OutCommand;
	
	public ExecuteCommand(CommandInterface inCommand, CommandInterface outCommand) {
		InCommand = inCommand;
		OutCommand = outCommand;
	}

	public void execIn() {
		InCommand.execute();
	}

	public void execOut() {
		OutCommand.execute();
	}
}
