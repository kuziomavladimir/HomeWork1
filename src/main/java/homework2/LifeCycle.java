package homework2;

import java.util.Random;

public class LifeCycle {
    // класс примитивно моделирует жизненный цикл животных, генерируя
    // события для каждого животного, пока его уровень здоровья больше нуля

    private Animals cat;
    private Animals dog;
    private Animals frog;
    private Random random;

    public LifeCycle() {
        cat = new Cat("Дымок");
        dog = new Dog("Барбос");
        frog = new Frog("Жора");
        random = new Random();
        System.out.println("Жизненный цикл создан");
    }

    public void startLife() {
        // цикл работает, пока все животные живы.
        // постарался сделать так, чтобы все животные, имея свои
        // сильные и слабые стороны, были в равных условиях

        while (cat.isAlife || dog.isAlife || frog.isAlife) {
            goCycle(frog, dog);
            goCycle(frog, cat);
            System.out.println();

            goCycle(cat, dog);
            goCycle(cat, frog);
            System.out.println();

            goCycle(dog, cat);
            goCycle(dog, frog);
            System.out.println();
        }
    }

    public void goCycle(Animals animal1, Animals animal2) {
        // метод случайным образом выбирает и вызывает события для переданного животного animal1
        // animal2 - то животное, которое получает урон от атаки первого животного animal1

        if(animal1.isAlife) {
            int r = random.nextInt(6) + 1;
            switch (r) {
                case 1:
                    animal1.doAttack(animal2);
                    break;
                case 2:
                    animal1.doVote();
                    break;
                case 3:
                    animal1.doEat();
                    break;
                case 4:
                    animal1.doClimbUpTrees();
                    break;
                case 5:
                    animal1.doMotion();
                    break;
                case 6:
                    animal1.doSwim();
            }
            animal1.showAnimalCharacteristics();
        }
    }
}
