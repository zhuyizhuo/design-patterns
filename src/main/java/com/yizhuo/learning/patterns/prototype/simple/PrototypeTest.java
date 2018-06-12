package com.yizhuo.learning.patterns.prototype.simple;

import java.util.ArrayList;

/**
 * Created by yizhuo on 2018/5/5.
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class PrototypeTest {

    //浅复制  引用类型没有复制
	public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p = new Prototype();
        p.setName("123456");
        ArrayList arrayList = new ArrayList();
        arrayList.add("123456");
        p.setTest(arrayList);
        Prototype clone = (Prototype)p.clone();
        System.out.println(p);
        System.out.println(clone);

        System.out.println( p.getTest() );
        System.out.println(clone.getTest());
        System.out.println("浅复制 list相等;" +(p.getTest() == clone.getTest()));
    }
}
