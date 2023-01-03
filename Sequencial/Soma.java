package sequencial;

import java.util.Scanner;

/*Faça um Programa que peça dois números e imprima a soma. */
public class Soma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma de " + num1 + " e " + num2 + " = " + soma);

        scan.close();
    }
}
