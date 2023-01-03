package sequencial;

import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double Celsius = leitor.nextDouble();
        double Fahrenheit = (1.8 * Celsius) + 32;

        System.out.println(Fahrenheit);

        leitor.close();
    }
}
