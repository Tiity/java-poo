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

        System.out.print("Entrez le premier nombre : ");
        int firstNumber = scanner.nextInt();
 
        System.out.print("Entrez le deuxième nombre : ");
        int secoundNumber = scanner.nextInt();
        scanner.close();

        String resultToFormat = "Résultat : %d * %d = %d";
        String result = String.format(resultToFormat, firstNumber, secoundNumber, firstNumber * secoundNumber);
 
        System.out.println(result);
     }
}
