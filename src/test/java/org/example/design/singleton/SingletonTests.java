package org.example.design.singleton;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

public class SingletonTests {

    private static final ThreadLocal<Integer> USER_LOCAL = new ThreadLocal<>();

    @Test
    public void testHungrySingleton() {

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(new Supplier<Integer>() {
            @Override
            public Integer get() {
                return null;
            }
        }, new Executor() {
            @Override
            public void execute(Runnable command) {

            }
        });

    }

}
