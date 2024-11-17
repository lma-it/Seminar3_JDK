package homework.comparator;

import homework.comparator.impl.Cat;
import homework.comparator.impl.Dog;

public class CompareMain {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new Dog("Vasiliy", 2),
                new Dog("Barsik", 3),
                new Dog("Murzik", 4),
                new Cat("Barsik", 3)};

        Dog[] dogs = new Dog[]{
                new Dog("Bobik", 5),
                new Dog("Sharik", 2),
                new Dog("Gav", 4),
                new Dog("Doggy", 3)};

        System.out.println(new ArrayComparator().compareArrays(animals, dogs));

    }
}
