package decisao;

import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é vogal ou consoante. */
public class VogalConsoante {
    public static void main(String[] args) {
        Scanner alfabeto = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = alfabeto.next();

        if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
            System.out.println("Vogal.");
        }
        else{
            System.out.println("Consoante");
        }



        alfabeto.close();
    }
}
