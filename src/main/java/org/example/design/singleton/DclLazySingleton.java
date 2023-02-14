package org.example.design.singleton;

import java.io.Serializable;

/**
 * 双检锁-懒汉式单例
 * @author 58491
 */
public class DclLazySingleton implements Serializable {
    private static final long serialVersionUID = -4629149761528553312L;

    private DclLazySingleton() {
    }

    // volatile 此处保证可见性
    private static volatile DclLazySingleton INSTANCE = null;

    public static DclLazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DclLazySingleton.class) {
                // 多线程阻塞在synchronized处，防止重复创建
                if (INSTANCE == null) {
                    INSTANCE = new DclLazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
