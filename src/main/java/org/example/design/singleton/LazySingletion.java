package org.example.design.singleton;


import java.io.Serializable;

/**
 * 懒汉式
 */
public class LazySingletion implements Serializable {
    private static final long serialVersionUID = -2481235825333503590L;

    private LazySingletion() {
    }

    private static LazySingletion INSTANCE = null;

    public static LazySingletion getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingletion();
        }
        return INSTANCE;
    }

}
