import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        String[] consoantes = new String[6]; // iniciando um arry vasio com 6 posições
        int quantidadeConsoantes = 0;

        int count = 0; // controla o loop
        do {
            System.out.println("Letra: ");
            String letra = scan.next();  //capture essa letra e atrubua a variável letra.

            if ( !(letra.equalsIgnoreCase("a") | // o equalsIgnoreCase não vai se importar se a letra está em maiuscula ou miniuscula
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while(count < consoantes.length);

        System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) {
            if ( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);

        scan.close();
    }
}
