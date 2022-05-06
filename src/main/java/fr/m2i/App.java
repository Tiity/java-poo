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
        int number = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 10; i++) {
            String resultToFormat = "%d * %d = %d";
            String result = String.format(resultToFormat, number, i, number * i);
            System.out.println(result);
        }
     }
}
