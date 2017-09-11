package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here


        int number = 0;
        String numberString;
        Scanner scanner = new Scanner(System.in);

        while (number != 11) {
            System.out.println("\nEnter a number between 1 and 10: ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    numberString = "The number 1 is UNO in Spanish.";
                    break;
                case 2:
                    numberString = "The number 2 is DOS in Spanish.";
                    break;
                case 3:
                    numberString = "The number 3 is TRES in Spanish.";
                    break;
                case 4:
                    numberString = "The number 4 is CUATRO in Spanish.";
                    break;
                case 5:
                    numberString = "The number 5 is CINCO in Spanish.";
                    break;
                case 6:
                    numberString = "The number 6 is SEIS in Spanish.";
                    break;
                case 7:
                    numberString = "The number 7 is SIETE in Spanish.";
                    break;
                case 8:
                    numberString = "The number 8 is OCHO in Spanish.";
                    break;
                case 9:
                    numberString = "The number 9 is NUEVE in Spanish.";
                    break;
                case 10:
                    numberString = "The number 10 is DIES in Spanish.";
                    break;
                default:
                    numberString = "Invalid entry.";
            }
            System.out.println(numberString);
        }
    }
}
