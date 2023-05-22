package org.exampl;

public class Joker extends Fighter {

    public Joker() {
        super(120, 30, "Joker");
    }

    @Override
    public void customAttack(Fighter enemy) {
        enemy.takeDamage((int) (this.getDamage() * 1.5));
        System.out.println(this.getName() + " attacks " + enemy.getName()
                + " with custom attack - poisoning");
    }
}
