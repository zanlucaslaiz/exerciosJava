package decisao;

import java.util.Scanner;

/*Faça um Programa que peça dois números e imprima o maior deles.
 */
public class Maior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = scan.nextInt();

        int maior = 0;

        if(num1 > num2){
            maior = num1;
        }
        else{
            maior = num2;
        }

        System.out.println("O maior numero é " + maior);

        scan.close();
    }
}
