package homework2;

public abstract class Animals {
    protected String name;
    protected int health;
    protected int hunger;       // голод
    protected int force;        // сила
    protected boolean isAlife;  // жив или нет

    public abstract void doVote();              // голос
    public abstract void doMotion();            // движение
    public abstract void checkHunger();         // проверка уровня голода
    public abstract void doEat(Food food);      //приём пищи

    public void showAnimalCharacteristics() {
        // показать характеристики животного

        System.out.println("Name: " + name + " Health: " + health + " Hunger: " + hunger + " Force: " + force +
                            " Is A life: " + isAlife);
    }

    public void doAttack(Animals animal) {
        // атаковать

        System.out.println(name + " Яростно атакует: " + animal.name);
        animal.health -= force * 0.7;
        hunger += 5;
    }

}
