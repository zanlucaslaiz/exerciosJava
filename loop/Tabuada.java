/*Desenvolva um gerador de tabuada, capaz de gerar a tabuaba de qualquer numero inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saida dever ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50 */
package loop;


import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 10. ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de "+ tabuada);

        for (int i = 1 ; i <= 10; i = i + 1 ){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    
        scan.close();
    }
    
}
