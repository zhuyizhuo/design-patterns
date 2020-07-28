package com.zhuo.designpatterns.behavioral.memento.black;

public class OriginatorB {
    private String state;
    private NarrowMemento memento;

    public OriginatorB() {
    }

    public NarrowMemento createMemento() {
        memento = new Memento(this.state);
        return memento;
    }

    public void restoreMemento(NarrowMemento memento) {
        Memento aMemento = (Memento) memento;
        this.setState(aMemento.getState());
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    protected class Memento implements NarrowMemento {
        private String savedState;

        private Memento(String someState) {
            savedState = someState;
        }

        private void setState(String someState) {
            savedState = someState;
        }

        private String getState() {
            return savedState;
        }

        @Override
        public void narrowMethod() {
            System.out.println("this is narrow method");
        }
    }

    public NarrowMemento getNarrowMemento() {
        return memento;
    }
}
