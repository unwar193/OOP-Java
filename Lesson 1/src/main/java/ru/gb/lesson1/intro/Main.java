package ru.gb.lesson1.intro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        incapsulation();
//        extension();
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("cat"));
        animals.add(new Dog("dog"));

        foo(new Animal("123"));
        foo(new Cat("123"));
        foo(new Dog("123"));

        // T => S extends T
    }

    private static void foo(Animal animal) {

    }

    private static void extension() {
        Animal animal1 = new Animal("animal name");
        Animal animal2 = new Animal("animal name", 450);

        Cat cat = new Cat("cat name");
        Dog dog = new Dog("dog name");

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(cat);
        System.out.println(dog);
    }

    private static void encapsulation() {
        User user = new User();
        user.rename("    Igor     ");
        user.rename("           ");

        System.out.println(user);
    }

}