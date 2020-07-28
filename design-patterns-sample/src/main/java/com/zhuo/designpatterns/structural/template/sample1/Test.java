package com.zhuo.designpatterns.structural.template.sample1;

/**
 * 无处不在的Template Method 
 * 如果你只想掌握一种设计模式，那么它就是Template Method! 
 * 
 * 动机(Motivate): 变化
 * -----是软件设计的永恒主题，如何管理变化带来的复杂性？设计模式的艺术性和复杂度就在于如何
 * 分析，并发现系统中的变化和稳定点，并使用特定的设计方法来应对这种变化。 
 * 
 * 意图(Intent):
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。Template Method使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * -------《设计模式》GOF
 * 
 * 适用性：
    
1．一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。
2．各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复。这是Opdyke和Johnson所描述过的“重分解以一般化”的一个很好的例子。首先识别现有代码中的不同之处，并且将不同之处分离为新的操作。最后，用一个调用这些新的操作的模板方法来替换这些不同的代码。
3．控制子类扩展。模板方法只在特定点调用“Hook”操作，这样就只允许在这些点进行扩展。

Template Mehtod实现要点：
1．Template Method模式是一种非常基础性的设计模式，在面向对象系统中有着大量的应用。它用最简洁的机制（虚函数的多态性）为很多应用程序框架提供了灵活的扩展点，是代码复用方面的基本实现结构。
2．除了可以灵活应对子步骤的变化外，“不用调用我，让我来调用你（Don't call me ,let me call you)”的反向控制结构是Template Method的典型应用。“Don’t call me.Let me call you”是指一个父类调用一个子类的操作，而不是相反。
3．在具体实现方面，被Template Method调用的虚方法可以具有实现，也可以没有任何实现（抽象方法，纯虚方法），但一般推荐将它们设置为protected方法。

 * @author zhuo
 * 
 */
public class Test {

    public static void main(String[] args)
    {

        car_parent car_ref_red = new car_imple_red();
        car_ref_red.run(300);

        car_parent car_ref_blue = new car_imple_blue();
        car_ref_blue.run(400);
    }
}

abstract class car_parent {
    private int speed;
    public int getSpeed() {
    	return speed;
    }
    public void setSpeed(int speed) {
    this.speed = speed;
    }
    protected abstract void print_speed();
    
    public void run(int speed){
    	this.setSpeed(speed);
    	
    	print_speed();
    }
}

class car_imple_red extends car_parent {
    public void print_speed()
    {
        System.out.println("将速度" + this.getSpeed() + "用红色的仪表盘显示车的速度");
    }

}

class car_imple_blue extends car_parent {
    public void print_speed()
    {
        System.out.println("将速度" + this.getSpeed() + "用蓝色的仪表盘显示车的速度");
    }
}
