package com.zhuo.designpatterns.structural.iterator;

/**
 * 动机(Motivate):
 * 在软件构建过程中，集合对象内部结构常常变化各异。但对于这些集合对象，我们希望在不暴露其内部结构的同时，
 * 可以让外部客户代码透明地访问其中包含的元素
 * ;同时这种“透明遍历”也为“ 同一种算法在多种集合对象上进行操作”提供了可能。
 * 
 * 使用面向对象技术将这种遍历机制抽象为“迭代器对象”为“应对变化中的集合对象”提供了一种优雅的方法。
 * 
 * 意图(Intent): 提供一种方法顺序访问一个聚合对象中各个元素, 而又不需暴露该对象的内部表示。-------《设计模式》GOF
 * 
 适用性：   
1．访问一个聚合对象的内容而无需暴露它的内部表示。
2．支持对聚合对象的多种遍历。
3．为遍历不同的聚合结构提供一个统一的接口(即, 支持多态迭代)。

Iterator实现要点：
1．迭代抽象：访问一个聚合对象的内容而无需暴露它的内部表示。
2．迭代多态：为遍历不同的集合结构提供一个统一的接口，从而支持同样的算法在不同的集合结构上进行操作。
3．迭代器的健壮性考虑：遍历的同时更改迭代器所在的集合结构，会导致问题。

 * @author zhuo
 * 
 */
public class Test {   
    /**  
     * @directed  
     */  
    private Iterator it;   
  
    /**  
     * @directed  
     */  
    private Aggregate agg = new ConcreteAggregate();   
  
    public void operation() {   
        it = agg.createIterator();   
  
        while (!it.isDone()) {   
            System.out.println(it.currentItem().toString());   
            it.next();   
        }
    }
  
    public static void main(String[] args) {
        Test client = new Test();   
        client.operation();   
    }   
}

interface Iterator   
{   
    void first();   
  
    void next();   
  
    boolean isDone();   
  
    Object currentItem();   
}  

class ConcreteIterator implements Iterator   
{   
    /**  
     * @directed   
     */  
    private ConcreteAggregate agg;   
    private int index = 0;   
    private int size = 0;   
  
    public ConcreteIterator(ConcreteAggregate agg)   
    {   
        this.agg = agg;   
        size = agg.size();   
        index = 0 ;   
    }   
  
    public void first()   
    {   
        index = 0 ;   
    }   
  
    public void next()   
    {   
        if (index < size)   
        {   
            index++;   
        }   
    }   
  
    public boolean isDone()   
    {   
        return (index >= size);   
    }   
  
    public Object currentItem()   
    {   
        return agg.getElement(index);   
    }   
}  

abstract class Aggregate   
{   
    public Iterator createIterator()   
    {   
        return null;   
    }   
}

class ConcreteAggregate extends Aggregate   
{   
    private Object objs[]= {"Monk Tang",   
        "Monkey", "Pigsy",   
        "Sandy", "Horse"};   
  
    public Iterator createIterator()   
    {   
        return new ConcreteIterator(this);   
    }   
  
    public Object getElement(int index)   
    {   
        if (index < objs.length)   
        {   
            return objs[index];   
        }   
        else  
        {   
            return null;   
        }   
    }   
  
    public int size()   
    {   
        return objs.length;   
    }   
}