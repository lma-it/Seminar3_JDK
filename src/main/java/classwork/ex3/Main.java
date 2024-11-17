package classwork.ex3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> numbers = new MyArrayList<>();

        System.out.println(numbers);
        for (int i = 0; i < 20; i++){
            numbers.add(new Random().nextInt(0,21));
        }
        System.out.println(numbers);

        System.out.println("Введите число, которое хотите удалить: ");
        numbers.removeAll(new Scanner(System.in).nextInt());

        System.out.println(numbers);

        numbers.add(10);
        System.out.println(numbers);

    }
}
