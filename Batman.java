package org.exampl;

public class Batman {
    private int health;
    private int damage;
    private String name;

    public Batman() {
        this.health = 100;
        this.damage = 20;
        this.name = "Batman";
    }

    public void takeDamage(int damage) {
        this.health = this.health - damage;
    }

    public void attack(Joker joker) {
        joker.takeDamage(this.damage);
        System.out.println(this.name + " attacks " + joker.getName() + " with damage " + this.damage);
    }

    public void displayHealth() {
        System.out.println(this.name + " health= " + this.getHealth());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
