package com.tarzan.common.utils;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.HashMap;

/**
 * 如何预估初始Map大小
 */
public class MapUtils {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(6);
        for (Integer i = 1; i <= 4; i++) {
            map.put(i.toString(), i);
            System.out.println("i = " + i + ", map size = " + map.size() + ", map capacity = " + tableLength(map));
        }
    }

    @SneakyThrows
    public static int tableLength(HashMap<?, ?> map) {
        Field table = HashMap.class.getDeclaredField("table");
        table.setAccessible(true);
        Object[] obj = (Object[]) table.get(map);
        return obj.length;
    }


}
