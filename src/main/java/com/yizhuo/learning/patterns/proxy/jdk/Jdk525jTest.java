package com.yizhuo.learning.patterns.proxy.jdk;

import com.yizhuo.learning.patterns.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class Jdk525jTest {

    public static void main(String[] args) {
        Jdk525j jdk525j = new Jdk525j();

        //此处一定是接口
        Person instance = (Person)jdk525j.getInstance(new Zhangsan());
        instance.findHouse();
        byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});

        try {
            FileOutputStream fo = new FileOutputStream("d:/proxy.class");
            fo.write($Proxy0s);
            fo.flush();
            fo.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
