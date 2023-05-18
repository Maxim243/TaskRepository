package org.exampl;

public class Batman extends Fighter {

    public Batman() {
        this.health = 100;
        this.damage = 20;
        this.name = "Batman";
    }

    @Override
    public void takeDamage(int damage) {
        this.health = this.health - damage;
    }

    @Override
    public void attack(Fighter fighter) {
        fighter.takeDamage(this.damage);
        System.out.println(this.name + " attacks " + fighter.getName() + " with damage " + this.damage);
    }

    @Override
    public void displayHealth() {
        System.out.println(this.name + " health= " + this.getHealth());
    }

    @Override
    public void dodgeFromAttack(Fighter fighter) {
        this.health += fighter.getDamage();
        System.out.println(this.getName() + " dodged from " + fighter.getName() + " attack");

    }
}
