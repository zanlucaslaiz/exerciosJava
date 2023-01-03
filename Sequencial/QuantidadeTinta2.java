package sequencial;
/* Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,
que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
- comprar apenas latas de 18 litros;
- comprar apenas galões de 3,6 litros;
- misturar latas e galões, de forma que o desperdício de tinta seja menor. 
Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias. */


import java.util.Scanner;
 // falta arredondar os valores e somar 10 %
public class QuantidadeTinta2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho da área a ser pintada[m²]: ");
        double area = scan.nextDouble();

        
        double litros = (area / 6) + (area * 10/100);

        double latas = litros / 18;
        double precoLata = 0;
        if(latas % 18 != 0){
            latas ++;
            precoLata = latas * 80;
        }

        double galoes = litros / 3.6;
        double precoGalao = 0;
        if(galoes % 3.6 != 0){
            galoes ++;
            precoGalao = latas * 25;
        }
        
        double misturaLata = litros / 18;
        double misturaGalao = (litros - (misturaLata * 18)) / 3.6;

        if (litros - (misturaLata * 18) % 3.6 != 0){
            misturaGalao ++;
        }
        
        double precoTotal = (misturaLata * 80) + (misturaGalao * 25);

        System.out.println("Somente latas de 18L: ");
        System.out.println("Para pintar " + Math.round(area) + " m², você precisa de "+ Math.round(latas) + " latas de tinta.");
        System.out.println("O preço total é " + Math.round(precoLata)  + " R$");

        System.out.println("---------------------------------------------------------------------");

        System.out.println("Somente galões de 3,6L: ");
        System.out.println("Para pintar " + Math.round(area) + " m², você precisa de "+ Math.round(galoes) + " galões de tinta.");
        System.out.println("O preço total é " + Math.round(precoGalao)  + " R$");

        System.out.println("---------------------------------------------------------------------");

        System.out.println("Latas e galões: ");
        System.out.println("Para pintar " + Math.round(area) + " m², você precisa de "+ Math.round(misturaLata) + " latas e " + Math.round(misturaGalao) + " galoes de tinta. " );
        System.out.println("O preço total é " + Math.round(precoTotal)  + " R$");


        scan.close();
    }
}

/* System.out.println("Por favor, escolha uma opção de compra.");
        System.out.println("Somente latas de 18L:[1] ");
        System.out.println("Somente galões de 3,6L:[2] ");
        System.out.println("Latas e galões:[3] "); */
