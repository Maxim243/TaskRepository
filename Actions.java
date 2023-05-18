package org.exampl;

public interface Actions {
    void takeDamage(int damage);

    void attack(Fighter fighter);

    void displayHealth();
    void dodgeFromAttack(Fighter fighter);
}
