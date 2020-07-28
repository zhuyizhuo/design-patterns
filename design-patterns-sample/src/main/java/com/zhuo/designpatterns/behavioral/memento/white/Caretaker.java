package com.zhuo.designpatterns.behavioral.memento.white;

/**
 * @author zhuo
 */
public class Caretaker {
    private Memento memento;

    public Memento retrieveMemento() {
        return this.memento;
    }

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
