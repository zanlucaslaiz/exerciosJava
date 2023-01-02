package Sequencial;

import java.util.Scanner;

/*Faça um Programa que peça as 4 notas bimestrais e mostre a média. */
public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4 ) / 4;

        System.out.println("A média é " + media);

        scan.close();
    }
}
