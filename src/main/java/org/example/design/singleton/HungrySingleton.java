package org.example.design.singleton;

import java.io.Serializable;

/**
 * 饿汉式：
 */
public class HungrySingleton implements Serializable{
    private static final long serialVersionUID = 535372109200731623L;

    /**
     * 私有构造器
     */
    private HungrySingleton() {
        // 防止反射破坏单例
        if (INSTANCE != null) {
            throw new RuntimeException("单例对象不能重复创建");
        }
    }

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 防止反序列化破坏单例
     * @return
     */
    public Object readResolve(){
        return INSTANCE;
    }
}
