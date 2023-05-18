package org.exampl;

public class Joker extends Fighter {

    public Joker() {
        this.health = 120;
        this.damage = 30;
        this.name = "Joker";
    }

    public void takeDamage(int damage) {
        this.health = this.health - damage;
    }


    @Override
    public void dodgeFromAttack(Fighter fighter) {
        this.health += fighter.getDamage();
        System.out.println(this.getName() + " dodged from " + fighter.getName() + " attack");
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
}
