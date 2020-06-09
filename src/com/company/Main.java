package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, x;


        System.out.println("Enter number");
        i = input.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println(" The number is " + i + " . ");

            System.out.println(" Enter mark");
            x = input.nextInt();
            if (x <= 100 && x >= 70) {
                System.out.println(" A ");
            } else if (x <= 69 && x >= 60) {
                System.out.println(" B ");
            } else if (x <= 59 && x >= 50) {
                System.out.println(" c ");
            } else if (x <= 49 && x >= 0) {
                System.out.println(" U ");
            } else {
                System.out.println(" INVALID");
            }
        }
    }
}
