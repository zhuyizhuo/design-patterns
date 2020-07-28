package com.zhuo.designpatterns.creational.abstractfactory;

/**
 * 
 * 抽象工厂模式的优点
 * 抽象工厂模式除了具有工厂方法模式的优点外，最主要的优点就是可以在类的内部对产品族进行约束。所谓的产品族，一般或多或少的都存在一定的关联，
 * 抽象工厂模式就可以在类内部对产品族的关联关系进行定义和描述，而不必专门引入一个新的类来进行管理。
 * 
 * 抽象工厂模式的缺点 
 * 产品族的扩展将是一件十分费力的事情，假如产品族中需要增加一个新的产品，则几乎所有的工厂类都需要进行修改。所以使用抽象工厂模式时，
 * 对产品等级结构的划分是非常重要的。
 * 
 * 适用场景 
 * 当需要创建的对象是一系列相互关联或相互依赖的产品族时，便可以使用抽象工厂模式。说的更明白一点，就是一个继承体系中，如果存在着多个等级结构（
 * 即存在着多个抽象类），并且分属各个等级结构中的实现类之间存在着一定的关联或者约束，就可以使用抽象工厂模式。假如各个等级结构中的实现类之间不存在关联或约束，
 * 则使用多个独立的工厂来对产品进行创建，则更合适一点。
 * 
 * 总结 
 * 无论是简单工厂模式，工厂方法模式，还是抽象工厂模式，他们都属于工厂模式，在形式和特点上也是极为相似的，他们的最终目的都是为了解耦。在使用时，
 * 我们不必去在意这个模式到底工厂方法模式还是抽象工厂模式
 * ，因为他们之间的演变常常是令人琢磨不透的。经常你会发现，明明使用的工厂方法模式，当新需求来临，稍加修改
 * ，加入了一个新方法后，由于类中的产品构成了不同等级结构中的产品族
 * ，它就变成抽象工厂模式了；而对于抽象工厂模式，当减少一个方法使的提供的产品不再构成产品族之后，它就演变成了工厂方法模式。
 * 所以，在使用工厂模式时，只需要关心降低耦合度的目的是否达到了。
 * 
 */
public class Test {
	public static void main(String[] args) {

	}
}

interface ProductA {
}

class ProductA1 implements ProductA {
	public ProductA1() {
	}
}

class ProductA2 implements ProductA {
	public ProductA2() {
	}
}

interface ProductB {
}

class ProductB1 implements ProductB {

}

class ProductB2 implements ProductB {
	public ProductB2() {
	};
}

interface Creator {
	public ProductA factoryA();

	public ProductB factoryB();
}

class ConcreteCreator1 implements Creator {
	public ProductA factoryA() {
		return new ProductA1();
	}

	public ProductB factoryB() {
		return new ProductB1();
	}
}

class ConcreteCreator2 implements Creator {
	public ProductA factoryA() {
		return new ProductA2();
	}

	public ProductB factoryB() {
		return new ProductB2();
	}
}