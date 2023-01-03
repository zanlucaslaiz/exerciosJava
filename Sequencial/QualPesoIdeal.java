package sequencial;

import java.util.Scanner;

/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7 */

public class QualPesoIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        
        System.out.println("Qual seu sexo? [M/F] ");
        String sexo = scan.next();

        if(sexo == "M"){
            double peso = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é " + peso);
        }
        else{
            double peso = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é " + peso);
        }

        scan.close();
    }
    
}
