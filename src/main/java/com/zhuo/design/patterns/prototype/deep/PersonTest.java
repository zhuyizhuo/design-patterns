package com.zhuo.design.patterns.prototype.deep;

import java.util.ArrayList;

/**
 *
 * @author yizhuo
 * @date 2018/5/5
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class PersonTest {

    //深复制
	public static void main(String[] args) throws CloneNotSupportedException {

        Person p = new Person();
        p.setName("abc");
        p.setBook(new Book());
        ArrayList arrayList = new ArrayList();
        arrayList.add("上衣");
        p.setClothes(arrayList);
        System.out.println(p);
        System.out.println(p.getBook());
        System.out.println(p.getClothes());

        Person clone = (Person)p.clone();
        System.out.println(clone);
        System.out.println(clone.getBook());
        System.out.println(clone.getClothes());


        System.out.println("深复制,list是否相等; "+ (p.getClothes() == clone.getClothes()));
    }
}
