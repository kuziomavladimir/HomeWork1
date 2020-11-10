package homework2;

import java.util.Random;

public class LifeCycle implements Runnable {
    // класс примитивно моделирует жизненный цикл животного animal, генерируя
    // случайные события для него, пока его уровень здоровья больше нуля

    private Animals animal;         // главное животное, для которого создаём жизненный цикл
    private Animals preyAnimal1;    // то животное, с которым будет взаимодействовать (кусать) animal
    private Animals preyAnimal2;    // то животное, с которым будет взаимодействовать (кусать) animal

    private Random random;
    public Thread t;

    public LifeCycle(Animals animal, Animals preyAnimal1, Animals preyAnimal2)
    {
        this.animal = animal;
        this.preyAnimal1 = preyAnimal1;
        this.preyAnimal2 = preyAnimal2;

        random = new Random();
        t = new Thread(this, animal.name + "Thread");
        t.start();
        System.out.println("Жизненный цикл создан: " + t.getName());
    }

    public void run() {
        // метод случайным образом выбирает и вызывает события для переданного животного animal

        while (animal.isAlife) {        // цикл работает, пока животное живо.
            int r = random.nextInt(7) + 1;

            switch (r) {
                case 1:
                    animal.doAttack(preyAnimal1);
                    break;
                case 2:
                    animal.doVote();
                    break;
                case 3:
                    animal.doEat();
                    break;
                case 4:
                    animal.doClimbUpTrees();
                    break;
                case 5:
                    animal.doMotion();
                    break;
                case 6:
                    animal.doSwim();
                    break;
                case 7:
                    animal.doAttack(preyAnimal2);
                    break;
            }
            animal.showAnimalCharacteristics();
            System.out.println();
        }
    }
}
