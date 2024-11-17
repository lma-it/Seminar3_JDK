package classwork.ex1.fruits.impl;

import classwork.ex1.fruits.Fruit;

public class Apple implements Fruit {
    public static final float WEIGHT = 1.0f;

    @Override public float getWeight() {
        return WEIGHT;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
