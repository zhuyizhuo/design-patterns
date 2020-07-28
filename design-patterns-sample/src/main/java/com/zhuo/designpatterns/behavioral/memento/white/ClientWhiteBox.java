package com.zhuo.designpatterns.behavioral.memento.white;

/**

 备忘录模式

 动机：
 在软件构建过程中，某些对象的状态在转换过程中，可能由于某种需要，要求程序能够回溯到对象之前处于某个点时的状态。如果使用一些公有接口来让其他对象得到对象的状态，便会暴露对象的细节实现。
 如何实现对象状态的良好保存与恢复？但同时又不会因此而破坏对象本身的封装性。

 意图：
 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后可以将该对象恢复到原先保存的状态。

 适用性：
 1.必须保存一个对象某一个时刻的(部分)状态，这样以后需要时它才能恢复到先前的状态。
 2.如果一个用接口来让其它对象直接得到这些状态，将会暴露对象的实现细节并破坏对象的封装性。

 Memento需要注意的几个要点：
 1.备忘录 (Memento) 存储原发器 (Originator) 对象的内部状态，在需要时恢复原发器状态。Memento 模式适用于“由原发器管理，却又必须存储在原发器之外的信息”。
 2.在实现 Memento 模式中，要防止原发器以外的对象访问备忘录对象。备忘录对象有两个接口，一个为原发器的宽接口;一个为其他对象使用的窄接口。
 3.在实现 Memento 模式时，要考虑拷贝对象状态的效率问题，如果对象开销比较大，可以采用某种增量式改变来改进 Memento 模式。

 * @author zhuo
 */
public class ClientWhiteBox {
    private static Originator o = new Originator();
    private static Caretaker c = new Caretaker();

    public static void main(String[] args) {
        o.setState("ON");
        c.saveMemento(o.CreateMemento());
        o.setState("OFF");
        o.restoreMemento(c.retrieveMemento());
    }
} 

