package com.zhuo.designpatterns.creational.singleton.sample1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class oiwuer {

    static List<Integer> list = new ArrayList<Integer>();

    static {
        for (int i = 0; i < 16; i++) {
            list.add(i);
        }
        System.out.println("list=" + list);
    }

    static List<Integer> newlist = new ArrayList<Integer>();

    public static void main(String[] args) {
    	Date date = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
    	String format = sdf.format(date);
    	System.out.println(format);
        for (int i = 0; i < 3; i++) {
        	Runnable runnable = new Runnable() {
				@Override
				public void run() {
					for (int j = list.size(); j >= 0; j--) {

	                    synchronized (list){
	                        setList(getRandom(), newlist);
	                    }

	                   /* try {
	                        Thread.sleep(1 * 1000);
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }*/
	                }
				}
			};
			new Thread(runnable).start();
        }

        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("newlist=" + newlist);
    }

    public static Integer getRandom() {

        if (list.size() <= 0) return null;
        Random random = new Random();
        Integer r = random.nextInt(list.size());
        Integer value = Integer.valueOf(list.get(r));

        String threadN = Thread.currentThread().getName();

        System.out.println(threadN + "-list=" + list);
        System.out.println(threadN + "-list.size=" + list.size() + " \t random=" + r + "\t return=" + value);
        return value;
    }

    public static void setList(Integer i, List newlist) {
        if (i == null) return;
        newlist.add(i);
        list.remove(new Integer(i));
        Date date = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
    	String format = sdf.format(date);
    	System.out.println(format);
        
    }
}