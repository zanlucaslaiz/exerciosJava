package Sequencial;
/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido. */

import java.util.Scanner;

public class DescontoSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora: ");
        double salarioHora = scan.nextDouble();

        System.out.println("Informe quantas horas você trabalha por mês: ");
        int horaMes = scan.nextInt();

        double salarioMes = salarioHora * horaMes;
        double IR = salarioMes * 11/100;
        double INSS = salarioMes * 8/100;
        double sindicato = salarioMes * 5/100;
        double descontos = salarioMes * 24/100;
        double salarioLiguido = salarioMes - descontos;

        System.out.println("+ Salário Bruto: " + salarioMes + " R$");
        System.out.println("-----------------------------");
        System.out.println("Descontos:");
        System.out.println("-----------------------------");
        System.out.println("- IR (8%): " + IR + " R$");
        System.out.println("- INSS (8%): " + INSS + " R$");
        System.out.println("- Sindicato (5%): " + sindicato + " R$");
        System.out.println("------------------------------");
        System.out.println("= Salário Liguido: " + salarioLiguido + "R$");



        scan.close();
    }
    
}
