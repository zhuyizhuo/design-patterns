package com.zhuo.designpatterns.behavioral.mediator;

/**
 * 参与者
 * @author zhuo
 */
public class Participant {
    private Chatroom chatroom;
    private String name;

    public Participant(String name) {
        super();
        this.name = name;
    }

    public Chatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(Chatroom chatroom) {
        this.chatroom = chatroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Send(String to, String message) {
        chatroom.send(name, to, message);
    }

    public void Receive(String from, String message) {
        System.out.println(from + " to " + name + ":'" + message + "'");
    }
}
