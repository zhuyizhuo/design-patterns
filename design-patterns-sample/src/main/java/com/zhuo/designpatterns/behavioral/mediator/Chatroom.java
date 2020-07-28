package com.zhuo.designpatterns.behavioral.mediator;

import java.util.Hashtable;

/**
 * 聊天室
 * @author zhuo
 */
public class Chatroom extends AbstractChatroom{

	private Hashtable participants = new Hashtable();

	@Override
	public void register(Participant participant) {
		if (participants.get(participant.getName()) == null){
			participants.put(participant.getName(), participant);
		}
		participant.setChatroom(this);
	}

	@Override
	public void send(String from, String to, String message) {
		 Participant pto = (Participant)participants.get(to);
		 if (pto != null){
			 pto.Receive(from, message);
		 }
	}

}
