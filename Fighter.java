package org.exampl;

public abstract class Fighter {
    private int health;
    private int damage;
    private String name;

    // this variable I created for displaying health in % but didn't do it
    private final int CONST_HEALTH;

    public Fighter(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
        CONST_HEALTH = health;
    }

    public int getCONST_HEALTH() {
        return CONST_HEALTH;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damage) {
        this.health = this.health - damage;
    }

    public abstract void customAttack(Fighter enemy);

    public void attack(Fighter fighter) {
        double number = Math.random();
        if (number <= 0.34) {
            fighter.takeDamage(this.damage);
            System.out.println(this.name + " attacks " + fighter.getName());
//                    + (this.damage / fighter.getCONST_HEALTH()) * 100 + " %");
        }
        if (number > 0.34 && number <= 0.66) {
            customAttack(fighter);
        }
        if (number > 0.66) {
            System.out.println(fighter.getName() + " has rejected attack from " + this.name);
        }
    }

    public void displayHealth() {
        System.out.println(this.name + " health = " + this.health);
    }

}
