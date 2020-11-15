package homework2;

public class Cat extends Animals {

    public Cat(String name) {
        this.name = name;
        health = 70;
        hunger = 10;    // голод
        force = 20;     // сила укуса
        isAlife = true;
        System.out.println("Кот создан");
    }

    @Override
    public void doEat(Food food) {
        if (hunger == 0)
            System.out.println(name + " Пытается поесть, но не голоден");
        else if (food.getFoodQuantity() <= 0) {
            System.out.println(name + " Пытается поесть, но нет еды");
        }
        else {
            hunger = 0;
            health += 7;
            System.out.println(name + " Поел! Good Food!");
            food.setFoodQuantity(food.getFoodQuantity() - 10);
        }
        health = (health > 70) ? 70 : health;
    }

    @Override
    public void doVote() {
        System.out.println("MeoW Meow");
        hunger += 1;
        checkHunger();
    }

    @Override
    public void doMotion() {
        System.out.println(name + " Бежит гулять");
        hunger += 3;
        checkHunger();
    }

    public void doClimbUpTrees() {
        System.out.println(name + " Прыгает на дерево");
        hunger += 5;
        checkHunger();
    }

    @Override
    public void checkHunger() {
        if(hunger > 80)
            health -= hunger / 10;
        if(health <= 0)
            isAlife = false;
    }
}
