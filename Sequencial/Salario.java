package Sequencial;
/* Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês. */

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double salarioHora = leitor.nextDouble();
        double horasMes = leitor.nextDouble();

        double mensal = salarioHora * horasMes;   

        System.out.println("Salario = " + mensal);

        leitor.close();
    }
    

}
