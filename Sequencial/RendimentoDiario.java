package sequencial;

/*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de 
São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. 
João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. 
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João 
deverá pagar. 
Imprima os dados do programa com as mensagens adequadas. */

import java.util.Scanner;


public class RendimentoDiario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double peso = scan.nextDouble();
        double taxa = 4.00;


        if(peso > 50){
            double diferenca = peso - 50;
            double multa = taxa * diferenca;
            System.out.println("Você excedeu " + diferenca + " kilos.");
            System.out.println("Você deve pagar uma multa de " + multa + "reais."); 
        }
        else{
            System.out.println("Você não precisa pagar multa.");
        }

        

        scan.close();
    }
}
