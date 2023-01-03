package sequencial;
/*Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9). */

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double Fahrenheit = leitor.nextDouble();
        double  Celsius = ( (Fahrenheit - 32) / 1.8);

        System.out.println(Celsius);

        leitor.close();
    }
}
