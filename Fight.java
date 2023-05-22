package org.exampl;


public class Fight {

    public static double whoWillAttackFirst() {
        return Math.random();
    }

    public static boolean isFighterDead(Fighter fighter, Fighter attacker) {
        boolean fighterHealth = fighter.getHealth() <= 0;
        if (fighterHealth) {
            System.out.println(attacker.getName() + " wins");
            return true;
        }
        fighter.displayHealth();
        return false;
    }

    public static void getFight(Fighter fighter1, Fighter fighter2) {
        boolean start = true;
        if (fighter1 == null || fighter2 == null) {
            System.out.println("Please create your fighter");
            return;
        }

        double number = whoWillAttackFirst();

        while (start) {
            if (number < 0.5) {

                fighter1.attack(fighter2);
                if (isFighterDead(fighter2, fighter1)) {
                    start = false;
                }
                if (start) {
                    fighter2.attack(fighter1);
                    if (isFighterDead(fighter1, fighter2)) {
                        start = false;
                    }
                }
            } else {
                fighter2.attack(fighter1);
                if (isFighterDead(fighter1, fighter2)) {
                    start = false;
                }
                if (start) {
                    fighter1.attack(fighter2);
                    if (isFighterDead(fighter2, fighter1)) {
                        start = false;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Fighter batman = new Batman();
        Fighter joker = new Joker();

        getFight(batman, joker);

    }
}
