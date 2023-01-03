package sequencial;
/*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
usando a seguinte fórmula: (72.7*altura) - 58 */

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double altura = scan.nextDouble();
        double peso = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal: " + peso);

        scan.close();
    }
}
