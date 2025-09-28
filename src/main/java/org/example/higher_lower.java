package org.example;

import java.util.Random;
import java.util.Scanner;

public class higher_lower {
    public void start() {
        Random random = new Random();
        Scanner userInput = new Scanner(System.in);

        int actualNumber = random.nextInt(100);
        int guessedNumber = 0;

        System.out.println("Can you guess my number between 1 and 100?");
        while (guessedNumber!=actualNumber) {
            guessedNumber = userInput.nextInt();

            if (guessedNumber == actualNumber){
                System.out.println("You guessed my number!");
            }else if (guessedNumber > actualNumber){
                System.out.println("Lower");
            }else {
                System.out.println("Higher");
            }
        }
    }
}
