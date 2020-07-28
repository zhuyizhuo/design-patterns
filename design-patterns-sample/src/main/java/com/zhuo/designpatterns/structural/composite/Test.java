package com.zhuo.designpatterns.structural.composite;


import java.util.Enumeration;
import java.util.Vector;

/**
 * 动机(Motivate):
 * 组合模式有时候又叫做部分-整体模式，它使我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以向处理简单元素一样来处理复杂元素
 * ,从而使得客户程序与复杂元素的内部结构解耦。 意图(Intent):
 * 将对象组合成树形结构以表示“部分-整体”的层次结构。Composite模式使得用户对单个对象和组合对象的使用具有一致性。
 * -----------《设计模式》GOF
 * 
 * 适用性：   
    1．你想表示对象的部分-整体层次结构

    2．你希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
    
 * 组合模式
 * 
 * @author sky
 * @version 2009-9-3
 */
public class Test
{
	public static void main(String args[])
	{
        //操作单一方法
        Leaf l= new Leaf();
        l.sampleOperation();

        //构造根枝
        Composite allc = new Composite();
        //构造次枝
        Composite c1 = new Composite();
        ((Composite)allc).add(c1);
        //构造叶子
        ((Composite)c1).add(new Leaf());
        ((Composite)c1).add(new Leaf());
        ((Composite)c1).remove(new Leaf());

        allc.sampleOperation();
	}
}

interface Component {
     public void sampleOperation();
}

class Composite implements Component {

    private Vector componentVector = new Vector();

    /**
     * 业务方法
     */
    public void sampleOperation() {
        Enumeration enumeration = components();
        //System.out.print("sampleOperation test");
        while (enumeration.hasMoreElements()){
            ((Component)(enumeration.nextElement())).sampleOperation();
        }
    }
    /**
     * 聚集管理方法，增加一个子构建对象
     */
    public void add(Component component){
        componentVector.add(component);
        //System.out.println("++++++++++"+componentVector.size());
    }
    /**
     * 聚集管理方法，删除一个子构建对象
     */
    public void remove(Component component){
        componentVector.remove(component);
        //System.out.println("----------"+componentVector.size());
    }
    /**
     * 聚集管理方法，返回聚集的Enumeration对象
     */
    public Enumeration components(){
        System.out.println("**********"+componentVector.size());
        return componentVector.elements();
    }
}


class Leaf implements Component {

    public void sampleOperation() {
        System.out.println("增加叶子");
    }

}
