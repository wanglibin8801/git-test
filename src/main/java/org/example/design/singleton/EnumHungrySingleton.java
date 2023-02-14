package org.example.design.singleton;

public enum EnumHungrySingleton {

    INSTANCE;

    EnumHungrySingleton() {
    }

    private static EnumHungrySingleton getInstance(){
        return INSTANCE;
    }
}
