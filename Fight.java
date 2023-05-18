package org.exampl;


public class Fight {

    public static void main(String[] args) {
        Batman batman = new Batman();
        Joker joker = new Joker();

        while (true) {
            batman.attack(joker);
            joker.attack(batman);
            joker.displayHealth();
            batman.displayHealth();
            if (joker.getHealth() <= 0) {
                System.out.println(batman.getName() + " wins");
                break;
            }

            if (batman.getHealth() <= 0) {
                System.out.println(joker.getName() + " wins");
                break;
            }
        }
    }
}
