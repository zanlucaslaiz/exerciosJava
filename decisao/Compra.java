package decisao;

import java.util.Scanner;

/*Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
sabendo que a decisão é sempre pelo mais barato. */
public class Compra {
    public static void main(String[] args) {
        Scanner compra = new Scanner(System.in);

        System.out.println("Informe o primeiro preço: ");
        double preco1 = compra.nextDouble();

        System.out.println("Informe o segundo preço: ");
        double preco2 = compra.nextDouble();

        System.out.println("Informe o terceiro preço: ");
        double preco3 = compra.nextDouble();

        double produto = 0;

        if(preco1 < preco2 && preco1 < preco3){
            produto = preco1;
        }
        if(preco2 < preco1 && preco2 < preco3){
            produto = preco2;
        }
        if(preco3 < preco1 && preco3 < preco2){
            produto = preco3;
        }

        System.out.println("Você deve comprar o produto de R$" + produto + ".");

        compra.close();
    }
}
