package org.example.design.singleton;

import java.io.Serializable;

/**
 * 内部类--懒汉式单例
 * @author 58491
 */
public class InnerLazySingleton implements Serializable {
    private static final long serialVersionUID = 1590948325045606868L;

    private InnerLazySingleton() {
    }

    private static class Holder {
        static InnerLazySingleton INSTANCE = new InnerLazySingleton();
    }

    public static InnerLazySingleton getInstance() {
        return Holder.INSTANCE;
    }
}
