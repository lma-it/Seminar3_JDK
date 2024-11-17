package classwork.ex1.box;

import classwork.ex1.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> container;

    public Box() { container = new ArrayList<>(); }

    public void add(T fruit)  { container.add(fruit); }

    public void print() {
        System.out.println(getWeight());
    }

    public T get(int index) { return container.get(index); }

    public float getWeight() { return container.getFirst().getWeight() * container.size(); }

    public boolean compareByWeight(Box<?> with) { return getWeight() == with.getWeight(); }

    public void transferTo(Box<? super T> dst) {
        dst.container.addAll(container);
        this.container.clear();
    }

    @Override
    public String toString() {
        return container.toString();
    }
}
