package org.exampl;

public class Joker {

    private int health;
    private int damage;
    private String name;

    public Joker() {
        this.health = 120;
        this.damage = 30;
        this.name = "Joker";
    }

    public void takeDamage(int damage) {
        this.health = this.health - damage;
    }

    public void attack(Batman batman) {
        batman.takeDamage(this.damage);
        System.out.println(this.name + "attacks " + batman.getName() + " with damage " + this.damage);
    }

    public void displayHealth() {
        System.out.println(this.name + " health= " + this.getHealth());
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
