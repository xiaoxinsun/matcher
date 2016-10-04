package com.bill.matcher;

import java.util.Optional;

public class Matcher {

    @FunctionalInterface
    public interface Side1Supplier<T> {
        T get();
    }

    @FunctionalInterface
    public interface Side2Selector<T> {
        Optional<T> select(T side1);
    }

    @FunctionalInterface
    public interface MatchAction<T> {
        void execute(T side1, T side2);
    }

    public <T> void match(Side1Supplier<T> side1Supplier, Side2Selector<T> side2Selector, MatchAction<T> action) {
        T side1 = side1Supplier.get();
        side2Selector.select(side1).ifPresent(side2 -> action.execute(side1, side2));
    }

}
