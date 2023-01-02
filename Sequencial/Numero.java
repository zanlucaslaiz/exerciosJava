package Sequencial;
/*Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. */
import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println("O número informado foi " + n);

        scan.close();
    }
}
