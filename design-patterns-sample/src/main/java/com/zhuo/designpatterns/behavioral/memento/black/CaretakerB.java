package com.zhuo.designpatterns.behavioral.memento.black;

/**
 * @author zhuo
 */
public class CaretakerB {
    private NarrowMemento memento;

    public NarrowMemento retrieveMemento() {
        return this.memento;
    }

    public void saveMemento(NarrowMemento memento) {
        this.memento = memento;
    }
}
