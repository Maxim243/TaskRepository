package org.exampl;


public class Fight {

    public static void getFight(Fighter batman, Fighter joker) {
        boolean start = true;
        if (batman == null || joker == null) {
            System.out.println("Please create your fighter");
            start = false;
        }

        int i = 0;
        while (start) {
            if (i < 1) {

                batman.attack(joker);
                joker.dodgeFromAttack(batman);
                joker.displayHealth();
                joker.attack(batman);
                batman.dodgeFromAttack(joker);
                batman.displayHealth();
                i++;
            }
            batman.attack(joker);
            batman.displayHealth();
            joker.attack(batman);
            joker.displayHealth();
            if (joker.getHealth() <= 0) {
                System.out.println(batman.getName() + " wins");
                start = false;
            }

            if (batman.getHealth() <= 0) {
                System.out.println(joker.getName() + " wins");
                start = false;
            }


        }

    }


    public static void main(String[] args) {
        Fighter batman = new Batman();
        Fighter joker = new Joker();

        getFight(batman, joker);

    }
}
