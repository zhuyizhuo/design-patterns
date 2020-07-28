package com.zhuo.designpatterns.structural.facade;

/**
 * 动机(Motivate):
 * 在软件开发系统中，客户程序经常会与复杂系统的内部子系统之间产生耦合，而导致客户程序随着子系统的变化而变化。那么如何简化客户程序与子系统之间的交互接口
 * ？如何将复杂系统的内部子系统与客户程序之间的依赖解耦？ 意图(Intent):
 * 为子系统中的一组接口提供一个一致的界面，Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。 --------《设计模式》GOF
 * 适用性： 1．为一个复杂子系统提供一个简单接口。 2．提高子系统的独立性。 3．在层次化结构中，可以使用Facade模式定义系统中每一层的入口。
 * 
 * Facade模式的个要点：
 * 从客户程序的角度来看，Facade模式不仅简化了整个组件系统的接口，同时对于组件内部与外部客户程序来说，从某种程度上也达到了一种
 * “解耦”的效果----内部子系统的任何变化不会影响到Facade接口的变化。
 * 
 * Facade设计模式更注重从架构的层次去看整个系统，而不是单个类的层次。Facdae很多时候更是一种架构 设计模式。
 * 
 * 注意区分Facade模式、Adapter模式、Bridge模式与Decorator模式。Facade模式注重简化接口，Adapter模式注重转换接口，
 * Bridge模式注重分离接口（抽象）与其实现，Decorator模式注重稳定接口的前提下为对象扩展功能。
 * 
 * 外观模式
 * @author zhuo
 * 
 */
public class Test
{
    public static void main(String []args){
       //客户端调用
       /*
       DrawerOne darwerOne=new DrawerOne();
       DrawerTwo darwerTwo=new DrawerTwo();
       darwerOne.open();
       darwerTwo.open();
       */

       //客户端通过外观模式调用

       DrawerFacade drawer=new DrawerFacade();

       drawer.open();

    }
}

/**
 * 外观模式
 */
class DrawerFacade{

    DrawerOne darwerOne=new DrawerOne();

    DrawerTwo darwerTwo=new DrawerTwo();

    public void open(){

       darwerOne.open();

       darwerTwo.open();

    }

}

class DrawerOne {

    public void open(){

       System.out.println("第一个抽屉被打开了");

       getKey();

    }

    public void getKey(){

       System.out.println("得到第二个抽屉的钥匙");

    }

}

class DrawerTwo{

    public void open(){

       System.out.println("第二个抽屉被打开了");

       getFile();

    }

    public void getFile(){

       System.out.println("得到这个重要文件");

    }

}


