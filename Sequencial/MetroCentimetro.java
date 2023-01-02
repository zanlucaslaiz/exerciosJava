package Sequencial;
/*Faça um Programa que converta metros para centímetros. */

import java.util.Scanner;

public class MetroCentimetro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double metro = scan.nextDouble();

        double centímetros = metro * 100;

        System.out.println(centímetros);


        scan.close();
    }
}
