package decisao;
/*Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */

import java.util.Scanner;


public class Sexo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sexo = scan.next();

        if("F".equalsIgnoreCase(sexo)){
            System.out.println("Sexo Feminino.");
        }
        else if("M".equalsIgnoreCase(sexo)){
            System.out.println("Sexo Masculino.");
        }
        else{
            System.out.println("Sexo inválido.");
        }

        scan.close();
    }
}
