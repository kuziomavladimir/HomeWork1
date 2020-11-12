package homework2;

public class Frog extends Animals {

    public Frog(String name) {
        this.name = name;
        health = 17;
        hunger = 45;   // голод
        force = 70;   // Сила яда
        isAlife = true;
        System.out.println("Лягушка создана");
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
            food.setFoodQuantity(food.getFoodQuantity() - 2);
        }
        health = (health > 17) ? 17 : health;
    }

    @Override
    public void doVote() {
        System.out.println("Qwa Qwa Qwa! Ur Ur Ur!");
        hunger += 1;
        checkHunger();
    }

    @Override
    public void doMotion() {
        System.out.println(name + " Прыгает куда-то");
        hunger += 1;
        checkHunger();
    }

    @Override
    public void doClimbUpTrees() {
        System.out.println(name +  ": Я не умею лазать по деревьям");
        checkHunger();
    }

    @Override
    public void doSwim() {
        System.out.println(name + " Плавает в пруду");
        hunger += 1;
        checkHunger();
    }

    @Override
    public void checkHunger() {
        if(hunger > 150)
            health -= hunger / 20;
        if(health <= 0)
            isAlife = false;
    }
}
