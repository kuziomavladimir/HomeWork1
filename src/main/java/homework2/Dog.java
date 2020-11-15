package homework2;

public class Dog extends Animals {

    public Dog(String name) {
        this.name = name;
        health = 100;
        hunger = 20;    // голод
        force = 35;     // сила укуса
        isAlife = true;
        System.out.println("Собака создана");

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
            food.setFoodQuantity(food.getFoodQuantity() - 30);
        }
        health = (health > 100) ? 100 : health;
    }

    @Override
    public void doVote() {
        System.out.println("Av gav gav! wuf wuf!");
        hunger += 2;
        checkHunger();
    }

    @Override
    public void doMotion() {
        System.out.println(name + " Бежит гулять");
        hunger += 5;
        checkHunger();
    }

    public void doSwim() {
        System.out.println(name + " Плавает в бассейне");
        hunger += 10;
        checkHunger();
    }

    @Override
    public void checkHunger() {
        if(hunger > 65)
            health -= hunger / 10;
        if(health <= 0)
            isAlife = false;
    }
}
