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
    public void doEat() {
        super.doEat();
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

    @Override
    public void doClimbUpTrees() {
        System.out.println(name +  ": Я не умею лазать по деревьям");
        checkHunger();
    }

    @Override
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
