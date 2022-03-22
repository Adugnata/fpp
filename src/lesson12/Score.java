package lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

class Score {
    private static int u_score;

    Score() {
        u_score = 0;
    }

    public static void userInput() {
        System.out.print("Enter your score:");
        Scanner in = new Scanner(System.in);
        try {
            u_score = in.nextInt();
            if (u_score < 0 || u_score > 100)
                throw new UnsupportedOperationException();
            System.out.println("Your score is " + u_score);
        } catch (InputMismatchException | UnsupportedOperationException e) {
            if (e.getClass().getSimpleName().equals("InputMismatchException"))
                System.out.println(e + ": Score should be a positive number!");
            if (e.getClass().getSimpleName().equals("UnsupportedOperationException"))
                System.out.println(e + ": Score can not be less than 0 or greater than 100!");
        }
    }

    public static void main(String[] args) {
        Score.userInput();

    }
}
