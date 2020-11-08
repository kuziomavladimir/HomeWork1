package homework2;

public abstract class Animals {
    protected String name;
    protected int health;
    protected int hunger;   // голод
    protected int force;    // сила

    public boolean isAlife; // жив или нет

    public abstract void doVote();      // голос
    public abstract void doMotion();    // движение
    public abstract void doClimbUpTrees();  // лазание по деревьям
    public abstract void doSwim();      // плавание
    public abstract void checkHunger(); // проверка уровня голода


    public void doEat() {   //приём пищи
        if (hunger == 0)
            System.out.println(name + " Пытается поесть, но не голоден");
        else {
            hunger = 0;
            health += 7;
            System.out.println(name + " Поел! Good Food!");
        }
    }

    public void showAnimalCharacteristics() {   // показать характеристики животного
        System.out.println("Name: " + name + " Health: " + health + " Hunger: " + hunger + " Force: " + force +
                            " Is A life: " + isAlife);
    }

    public void doAttack(Animals animal) {  // атаковать
        System.out.println(name + " Яростно атакует: " + animal.name);
        animal.health -= force * 0.7;
        hunger += 5;
    }

}
