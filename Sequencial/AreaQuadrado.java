package sequencial;

import java.util.Scanner;

/* Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 */
public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double comprimento = leitor.nextDouble();

        double area = (comprimento * comprimento);
        double dobro = area * 2;

        System.out.println("O Dobro da área do quadrado é " + dobro);


        leitor.close();
    }
}
