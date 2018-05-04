package com.yizhuo.learning.patterns.singleton.lazy;

//特点：在外部类被调用的时候内部类才会被加载
//内部类一定是在方法调用之前初始化
//巧妙地避免了线程安全问题

//这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
//完美地屏蔽了这两个缺点
//史上最牛B的单例模式的实现方式
public class BestLazy {

    private static boolean initialized = false;

    //默认使用LazyThree的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
	private BestLazy() {
		synchronized (BestLazy.class){
            if(initialized == false){
                initialized = !initialized;
            }else{
                throw new RuntimeException("单例已被侵犯");
            }
        }
	}
	
	public static final BestLazy getInstance(){
		return LazyHolder.Lazy;
	}
	
	private static class LazyHolder{
		public static final BestLazy Lazy = new BestLazy();
	}
	
}
