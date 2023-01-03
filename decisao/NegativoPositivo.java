package decisao;

import java.util.Scanner;

/*Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */
public class NegativoPositivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();

        if(numero > 0){
            System.out.println("O número " + numero + " é positivo.");
        }
        if(numero < 0){
            System.out.println("O número " + numero + " é negativo.");
        }
        

        scan.close();
    }
}
