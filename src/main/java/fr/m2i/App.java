package fr.m2i;

import java.util.Scanner;

public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saisissez un nombre : ");
        
        SimpleCalculator.calcuteTableOf10(scanner.nextInt());

        scanner.close();
     }
}
