package sequencial;
/*Faça um Programa que peça o raio de um círculo, calcule e mostre sua área. */

import java.util.Scanner;

public class Raio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

    double raio = leitor.nextDouble();
    double area = 3.14 * (raio*raio);

    System.out.println(area);
        leitor.close();
    }
}
