package com.zhuo.design.patterns.prototype.deep;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yizhuo
 * @date 2018/5/5
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class Person implements Cloneable{
    private String name;
    private Book book;
	private List clothes;

    public List getClothes() {
        return clothes;
    }

    public void setClothes(List clothes) {
        this.clothes = clothes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

	@Override
    protected Object clone() throws CloneNotSupportedException {

        Person clone = (Person)super.clone();
        clone.setBook(book.clone());

        ArrayList arrayList = new ArrayList();
        arrayList.addAll(clothes);
        clone.setClothes(arrayList);
        return clone;
    }
}
