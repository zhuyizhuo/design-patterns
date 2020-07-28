package com.zhuo.designpatterns.behavioral.memento;

/**
 * 动机：
    在软件构建过程中，某些对象的状态在转换过程中，可能由于某种需要，要求程序能够回溯到对象之前处于某个点时的状态。如果使用一些公有接口来让其他对象得到对象的状态，便会暴露对象的细节实现。
    如何实现对象状态的良好保存与恢复？但同时又不会因此而破坏对象本身的封装性。
意图：
在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后可以将该对象恢复到原先保存的状态。

适用性：
    1.必须保存一个对象某一个时刻的(部分)状态，这样以后需要时它才能恢复到先前的状态。
    2.如果一个用接口来让其它对象直接得到这些状态，将会暴露对象的实现细节并破坏对象的封装性。
   
   Memento需要注意的几个要点：
    1.备忘录(Memento)存储原发器(Originator)对象的内部状态，在需要时恢复原发器状态。Memento模式适用于“由原发器管理，却又必须存储在原发器之外的信息”。
    2.在实现Memento模式中，要防止原发器以外的对象访问备忘录对象。备忘录对象有两个接口，一个为原发器的宽接口;一个为其他对象使用的窄接口。
    3.在实现Memento模式时，要考虑拷贝对象状态的效率问题，如果对象开销比较大，可以采用某种增量式改变来改进Memento模式。
    
 * @author zhuo
 *
 */
//双接口的实现，宽窄接口（黑箱)
interface NarrowMemento {   
    public void narrowMethod();   
}   
class OriginatorB {   
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
    // 内部类   
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
        public void narrowMethod() {   
            System.out.println("this is narrow method");   
        }   
    }   
    public NarrowMemento getNarrowMemento() {   
        return memento;   
    }   
}   
class CaretakerB {   
    private NarrowMemento memento;   
    public NarrowMemento retrieveMemento() {   
        return this.memento;   
    }   
    public void saveMemento(NarrowMemento memento) {   
        this.memento = memento;   
    }   
}   
public class Client_Black_Box {   
    private static OriginatorB o = new OriginatorB();   
    private static CaretakerB c = new CaretakerB();   
    public static void main(String[] args) {   
        // use wide interface   
        o.setState("On");   
        c.saveMemento(o.createMemento());   
        o.setState("Off");   
        o.restoreMemento(c.retrieveMemento());   
        // use narrow interface   
        NarrowMemento memento = o.getNarrowMemento();   
        memento.narrowMethod();   
    }   
} 

