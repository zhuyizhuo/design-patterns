package com.zhuo.designpatterns.behavioral.memento;
//白箱备忘录的实现
class Originator{   
    private String state;   
    public Memento CreateMemento(){   
        return new Memento(state);   
    }   
    public void restoreMemento(Memento memento){   
        this.state = memento.getState();   
    }   
    public String getState(){   
        return this.state;   
    }   
    public void setState(String state){   
        this.state=state;   
        System.out.println("Current state = " + this.state);   
    }   
}   
class Memento{   
    private String state;   
    public Memento(String state){   
        this.state = state;   
    }   
    public String getState(){   
        return this.state;   
    }   
    public void setState(){   
        this.state = state;   
    }   
}   
class Caretaker{   
    private Memento memento;   
    public Memento retrieveMemento(){   
        return this.memento;   
    }   
    public void saveMemento(Memento memento){   
        this.memento = memento;   
    }   
}   
public class Client_White_Box{   
    private static Originator o = new Originator();   
    private static Caretaker c = new Caretaker();   
    public static void main(String[] args){   
        o.setState("ON");   
        c.saveMemento(o.CreateMemento());   
        o.setState("OFF");   
        o.restoreMemento(c.retrieveMemento());   
    }   
} 

