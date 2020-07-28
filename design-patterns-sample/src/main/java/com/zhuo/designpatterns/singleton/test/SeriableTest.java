package com.zhuo.designpatterns.singleton.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.zhuo.designpatterns.singleton.seriable.Seriable;

public class SeriableTest {
	
	public static void main(String[] args) {
		
		Seriable s1 = null;
		Seriable s2 = Seriable.getInstance();
		try {
			FileOutputStream fo = new FileOutputStream("SeriableTest.out");
			ObjectOutputStream ou = new ObjectOutputStream(fo);
			ou.writeObject(s2);
			ou.flush();
			ou.close();
			fo.close();
			
			FileInputStream fi = new FileInputStream("SeriableTest.out");
			ObjectInputStream oi = new ObjectInputStream(fi);
			s1 = (Seriable)oi.readObject();
			oi.close();
			fi.close();
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s1 == s2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
