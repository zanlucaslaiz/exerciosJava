package decisao;
/*Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso. */

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual turno você estuda? [M - Matutino, V - Vespertino, N - Noturno.]");
        String turno = scan.next();

        if(turno.equalsIgnoreCase("M")){
            System.out.println("Bom dia!");
        }
        else if(turno.equalsIgnoreCase("V")){
            System.out.println("Boa tarde!");
        }
        else if(turno.equalsIgnoreCase("N")){
            System.out.println("Boa noite!");
        }
        else{
            System.out.println("Valor Inválido!");
        }

        scan.close();
    }
}
