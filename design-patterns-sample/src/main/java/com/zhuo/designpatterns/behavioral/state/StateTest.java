package com.zhuo.designpatterns.behavioral.state;

/**
 * 动机： 在软件构建过程中，某些对象的状态如果改变以及其行为也会随之而发生变化，比如文档处于只读状态，其支持的行为和读写状态支持的行为就可能完全不同。
 * 如何在运行时根据对象的状态来透明更改对象的行为？而不会为对象操作和状态转化之间引入紧耦合？ 意图：
 * 允许一个对象在其内部状态改变时改变它的行为。从而使对象看起来似乎修改了其行为。 ------《设计模式》GOF
 * 
 * 适用性：
 * 1.一个对象的行为取决于它的状态，并且它必须在运行时刻根据状态改变它的行为。
 * 2.一个操作中含有庞大的多分支的等条件语句，且这些分支依赖于该对象的状态
 * 。这个状态通常用一个或多个枚举常量表示。通常，有多个操作包含这一相同的条件结构。State模式将每一个分支放入一个独立的类中
 * 。这使得你可根据对象自身的情况将对象的状态作为一个对象，这一对象可以不依赖于其他对象而独立变化。
 *
 *State模式的几个要点：
    1.State模式将所有一个特定状态相关的行为都放入一个State的子类对象中，在对象状态切换时，切换相应的对象;但同时维持State的接口，这样实现了具体操作与状态转换之间的解耦。
    2.为不同的状态引入不同的对象使得状态转换变得更加明确，而且可以保证不会出现状态不一致的情况，因为转换是原子性的----即要么彻底转换过来，要么不转换。
    3.如果State对象没有实例变量，那么各个上下文可以共享 同一个State对象，从而节省对象开销。
 * 
 * @author zhuo
 * 
 */
interface State
{
	public void shot();
}

// 然后实现具体状态，我们这里有三个，三种状态三种行为。
// 不正常
class NonormalState implements State
{
	public void shot()
	{
		System.out.println("今天你投篮十中一");
	}
}

// 正常：
class NormalState implements State
{
	public void shot()
	{
		System.out.println("今天你投篮十中五");
	}
}

// 超常：
class SuperState implements State
{
	public void shot()
	{
		System.out.println("今天你投篮十中十");
	}
}

// 这个时候我们来一个环境，一个运动员,正常情况下是正常状态
class Player
{
	private State state = new NormalState();

	public void setState(State state)
	{
		this.state = state;
	}

	public void shot()
	{
		state.shot();// 这里我感觉是创建型模式的适配器模式，对象适配器。应该就是这样，
	}
}

// 测试这个例子
public class StateTest
{
	public static void main(String[] args){
		Player player=new Player();
		player.shot();// 正常下投篮
		player.setState(new NonormalState());
		player.shot();//不正常下投篮
		player.setState(new SuperState());
		player.shot();//超常下投篮
	}
}