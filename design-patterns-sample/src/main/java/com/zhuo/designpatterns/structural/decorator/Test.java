package com.zhuo.designpatterns.structural.decorator;


/**
 * 动机(Motivate)：
    上述描述的问题根源在于我们“过度地使用了继承来扩展对象的功能”，由于继承为类型引入的静态物质，使得这种扩展方式缺乏灵活性;并且随着子类的增多（扩展功能的增多），各种子类的组合（扩展功能组合）会导致更多子类的膨胀（多继承）。
   如何使“对象功能的扩展”能够根据需要来动态地实现？同时避免“扩展功能的增多”带来的子类膨胀问题？从而使得任何“功能扩展变化”所导致的影响将为最低？
意图(Intent):
    动态地给一个对象添加一些额外的职责。就增加功能来说，Decorator模式相比生成子类更为灵活。
                                                              ------《设计模式》GOF
                                                              
 * 适用性：
    需要扩展一个类的功能，或给一个类增加附加责任。

    需要动态地给一个对象增加功能，这些功能可以再动态地撤销。

    需要增加由一些基本功能的排列组合而产生的非常大量的功能，从而使继承关系变得不现实。
    
 * 装饰模式(Decorator Pattern)
 */
public class Test
{
	public static void main(String[] args)
	{
		/**原始构件*/
        Component component = new ConcreteComponent();
        /**边听音乐，边走路*/
        ConcreteDecoratorListen cdl = new ConcreteDecoratorListen(component);
        cdl.go();
        System.out.println();
        /**边走路，边唱歌*/
        ConcreteDecoratorSing cds = new ConcreteDecoratorSing(component);
        cds.go();

	}
}
/**
 * 原始接口
 */
interface Component
{
	public void go();
}
/**
 * 具体构件
 */
class ConcreteComponent implements Component
{
	public void go()
	{
		System.out.println("行走");
	}

}

/**
 * 装饰角色
 */
class Decorator implements Component
{
	/**持有私有的原始构件*/
	private Component component;

	/**构造子，委派给原始构件*/
	protected Decorator(Component component) {
		this.component = component;
	}

	/**调用原始构件功能，通常就可直接把扩展功能加在此方法中*/
	public void go() {
		this.component.go();
	}

}
class ConcreteDecoratorListen extends Decorator {

    /**构造子，相关初始化*/
    public ConcreteDecoratorListen(Component component) {
        super(component);
        // code is here
    }

    /**商业逻辑，对原始构件功能的扩展*/
    public void go() {
        listen("听音乐");//执行扩展功能
        super.go();
    }

    private void listen(Object obj){
        System.out.println(obj);
    }

}

class ConcreteDecoratorSing extends Decorator {

    /**构造子，相关初始化*/
    public ConcreteDecoratorSing(Component component) {
        super(component);
        // code is here
    }

    /**商业逻辑，对原始构件功能的扩展*/
    public void go() {
        super.go();
        System.out.println(sing());;// 执行扩展功能
    }

    private String sing() {
        return"唱歌";
    }
}
