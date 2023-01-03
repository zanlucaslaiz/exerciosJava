package sequencial;
/*Faça um programa para uma loja de tintas. 
O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros,
que custam R$ 80,00. 
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuantidadeTinta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho da área a ser pintada[m²]: ");
        double area = scan.nextDouble();
        DecimalFormat formatador = new DecimalFormat("0.00");
        double litros = area / 3;
        double latas = litros / 18;
        double preco = 80.0 * latas;

        System.out.println("Para pintar " + formatador.format(area) + " m², você precisa de "+ formatador.format(latas) + " latas de tinta.");
        System.out.println("O preço total é " + formatador.format(preco)  + " R$");


        scan.close();
    }
    
}
