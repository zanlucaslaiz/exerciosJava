package Sequencial;

import java.util.Scanner;
import java.lang.Math;

/* Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .
a soma do triplo do primeiro com o terceiro.
o terceiro elevado ao cubo. */


public class SomaInteiroReal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        double num3 = leitor.nextDouble();

        int dobro = num1 * 2;
        int metade = num2 / 2;
        int produto = dobro * metade;
        int triplo = num1 * 3;
        double soma = triplo + num3;
        double cubo = Math.pow(num3, 3);

        System.out.println("O dobro de " + num1 + " multiplicado pela metade de " + num2 + " é igual: " + produto);
        System.out.println("A soma do triplo de " + num1 + " + " + num3 + " é igual: " + soma);
        System.out.println("O "+ num3 + " ao cubo é " + cubo);



        leitor.close();
    }
}
