package com.webnono.singleton;

/**
 * Created by Administrator on 2015/12/12.
 */
public class Singleton {

    private static Singleton uniqueInstance = null;
    //类加载是创建对象，如果没有使用该对象，造成一定的资源浪费，但是解决了多线程竞争资源的问题
    private static Singleton uniqueInstance1 = new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        if (uniqueInstance ==  null){
            return new Singleton();
        }
        return uniqueInstance;
    }

    private static Singleton getUniqueInstance1(){
        return uniqueInstance1;
    }
    public static synchronized Singleton getUniqueInstance(){
        if (uniqueInstance == null)return new Singleton();
        return uniqueInstance;
        //同步锁比较消耗资源，如果不是经常调用这个类，可以使用这个方法
    }

    /**
     * 经典单例模式的多线程优化
     * 双检锁方法
     * @return
     */
    public static Singleton getUniqueInstanceWithDoubleCheck(){
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    return new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
