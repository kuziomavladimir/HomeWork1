package ru.example;

import homework1.HomeWork1;
import homework2.*;

public class MainClass {

    public static void main(String[] args) {
//        HomeWork1 homeWork1 = new HomeWork1();

//        new LifeCycle().startLife();

        Animals cat = new Cat("Дымок");
        Animals dog = new Dog("Барбос");
        Animals frog = new Frog("Жора");

        LifeCycle catLifeCycle = new LifeCycle(cat, dog, frog);
        LifeCycle dogLifeCycle = new LifeCycle(dog, cat, frog);
        LifeCycle frogLifeCycle = new LifeCycle(frog, dog, cat);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getClass());
        }

        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());

        try {
            catLifeCycle.t.join();
        } catch (InterruptedException e) {
            System.out.println(e.getClass());
        }

        System.out.println(catLifeCycle.t.isAlive());

    }
}
