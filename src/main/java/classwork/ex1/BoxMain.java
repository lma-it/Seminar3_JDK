package classwork.ex1;

import classwork.ex1.box.Box;
import classwork.ex1.fruits.Fruit;
import classwork.ex1.fruits.impl.Apple;
import classwork.ex1.fruits.impl.Orange;

public class BoxMain {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Fruit> fruitBox = new Box<>();

        fruitBox.add(new Orange());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        System.out.println(appleBox.compareByWeight(orangeBox));
        appleBox.transferTo(fruitBox);
        System.out.println(fruitBox);
    }
}
