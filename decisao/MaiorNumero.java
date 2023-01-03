package decisao;

/*Faça um Programa que leia três números e mostre o maior deles. */
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o primeiro número: ");
        int num2 = scan.nextInt();

        System.out.println("Digite o primeiro número: ");
        int num3 = scan.nextInt();

        int maior = 0;

        if(num1 > num2 && num1 > num3){
            maior = num1;
        }
        if(num2 > num1 && num2 > num3){
            maior = num2;
        }
        if(num3 > num1 && num3 > num2){
            maior = num3;
        }

        System.out.println("O maior número é " + maior + ".");
        scan.close();
    }
}
