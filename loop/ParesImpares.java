/* Faça um programa que peça N numeros inteiros, calcule e mostre a 
quantidade de números pares e a 
quantidade de números impares. */
package exercicios;

import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int pares = 0;
        int impares = 0;
        

        System.out.println("Digite quantos números: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) pares++; // pares = pares + 1 
            else impares++; // impares = impares + 1

            count++;

        } while(count < quantNumeros);

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números impares: " + impares);


        scan.close();
    }
    
}
