package org.exampl;

public class Batman extends Fighter {

    public Batman() {
        super(100, 20, "Batman");
    }

    @Override
    public void customAttack(Fighter enemy) {
        enemy.takeDamage(this.getDamage() * 2);
        System.out.println(this.getName() +" attacks " + enemy.getName() + " with custom attack - double punch");
    }
}
