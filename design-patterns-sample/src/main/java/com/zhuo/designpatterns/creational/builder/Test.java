package com.zhuo.designpatterns.creational.builder;


/**
 * 建造者模式(Builder)
Builder模式的缘起：
    假设创建游戏中的一个房屋House设施，该房屋的构建由几部分组成，且各个部分富于变化。如果使用最直观的设计方法，每一个房屋部分的变化，都将导致房屋构建的重新修正.....
动机（Motivation):
    在软件系统中，有时候面临一个"复杂对象"的创建工作，其通常由各个部分的子对象用一定算法构成;由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合到一起的算法却相对稳定。
    如何应对种变化呢？如何提供一种"封装机制"来隔离出"复杂对象的各个部分"的变化，从而保持系统中的"稳定构建算法"不随需求的改变而改变？
意图(Intent)：
    将一个复杂对象的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
                                              -------《设计模式》GOF
                                              
                      适用性：
    1.当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
    2.当构造过程必须允许被构造的对象有不同的表示时。
    
    即流程相同  但是使用的对象却不同  抽象出接口将流程每步封装  并使用一个导向器 封装步骤顺序
    
 * @author zhuo
 *
 */
public class Test
{
	public static void main(String[] args)
	{
		Director c = new Director();
		Builder builder = new ConcreteBuilderA();
		c.construct(builder);
		builder.retrieveResult();
		
		builder = new ConcreteBuilderB();
		c.construct(builder);
		builder.retrieveResult();
	}
}
class Director
{
	public void construct(Builder builder)
	{
		//适用于此处流程基本固定 但是构成流程的对象多变的情况
		builder.buildPart1();
		builder.buildPart2();
	}
}

abstract class Builder
{
	public abstract void buildPart1();
	public abstract void buildPart2();
	public abstract Product retrieveResult();
}
class ConcreteBuilderA extends Builder
{
	private Product product = new Product();

	public Product retrieveResult()
	{
		return product;
	}
	public void buildPart1()
	{
	}
	public void buildPart2()
	{
	}
}
class ConcreteBuilderB extends Builder
{
	private Product product = new Product();

	public Product retrieveResult()
	{
		return product;
	}
	public void buildPart1()
	{
	}
	public void buildPart2()
	{
	}
}
class Product
{
}