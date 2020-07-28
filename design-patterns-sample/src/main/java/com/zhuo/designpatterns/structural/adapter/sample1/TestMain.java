package com.zhuo.designpatterns.structural.adapter.sample1;

/**
 * 适配（转换）的概念无处不在......
 * 适配，即在不改变原有实现的基础上，将原先不兼容的接口转换为兼容的接口。
 * 例如：二转换为三箱插头，将高电压转换为低电压等。
 * <p>
 * 动机(Motivate):
 * 在软件系统中，由于应用环境的变化，常常需要将“一些现存的对象”放在新的环境中应用，但是新环境要求的接口是这些现存对象所不满足的。
 * 那么如何应对这种“迁移的变化”？如何既能利用现有对象的良好实现，同时又能满足新的应用环境所要求的接口？这就是本文要说的Adapter 模式。
 * 意图(Intent):
 * 将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * 适用性：
 * 1．系统需要使用现有的类，而此类的接口不符合系统的需要。
 * <p>
 * 2．想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。这些源类不一定有很复杂的接口。
 * <p>
 * 3．（对对象适配器而言）在设计里，需要改变多个已有子类的接口，如果使用类的适配器模式，就要针对每一个子类做一个适配器，而这不太实际。                                                                          -------《设计模式》GOF
 *
 * @author zhuo
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
    }
}

/**
 * 目标接口
 *
 * @author zhuo
 */
interface Target {
    void sampleOperation1();

    void sampleOperation2();
}

/**
 * 源
 *
 * @author zhuo
 */
class Adaptee {
    public void sampleOperation1() {
    }
}

/**
 * 适配器类
 *
 * @author zhuo
 */
class Adapter extends Adaptee implements Target {
    @Override
    public void sampleOperation2() {
    }
}
