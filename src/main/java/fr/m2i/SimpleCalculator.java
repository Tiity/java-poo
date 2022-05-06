package fr.m2i;

public class SimpleCalculator {

    public static void calcuteTableOf10(int number) {
        for (int i = 1; i <= 10; i++) {
            String resultToFormat = "%d * %d = %d";
            String result = String.format(resultToFormat, number, i, number * i);
            System.out.println(result);
        }
    }
}
