/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnum;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Abas
 */
public class GuessNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int r = (int) (Math.random() * 100 + 1);
        int count = 0;

        int guess = 0;

        while (guess != r) {

            count++;
            System.out.println("Please enter a number between 0 & 100:\n");
            guess = input.nextInt();

            if (guess < r) {

                System.out.println("\nToo low\n");

            } else if (guess > r) {

                System.out.println("\nToo high\n");

            } else if (guess == r) {

                System.out.println("\nYOU'VE GOT IT!\n");

            }

        }

        System.out.println("It took you only " + count + " attempts!");

    }

}
