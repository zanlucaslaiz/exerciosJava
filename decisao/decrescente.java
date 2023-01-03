package decisao;

import java.util.Scanner;

/*Faça um Programa que leia três números e mostre-os em ordem decrescente. */
public class decrescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("Terceiro número: ");
        int num3 = scan.nextInt();

        int primeiro = 0;
        int segundo = 0;
        int terceiro = 0;

        if(num1 > num2 && num2 > num3){
            primeiro = num1;
            segundo = num2;
            terceiro = num3;
        }
        if(num2 > num1 && num1 > num3){
            primeiro = num2;
            segundo = num1;
            terceiro = num3;
        }
        if(num3 > num1 && num2 > num1){
            primeiro = num3;
            segundo = num2;
            terceiro = num1;
        }

    System.out.println("Primeiro é " + primeiro + ", Segundo é " + segundo + ", Terceiro é " + terceiro + "." );

        scan.close();
    }
}
