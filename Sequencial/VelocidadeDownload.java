package sequencial;
/*Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).]
Tamanho do arquivo em megabytes / (velocidade de download em megabits / 8) =  tempo em segundos. */

import java.util.Scanner;

public class VelocidadeDownload {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo [MB]: ");
        float arquivo = scan.nextFloat();
        System.out.println("Informe a velocidade do link [Mbps]: ");
        float velocidade = scan.nextFloat();

        float download = arquivo / (velocidade / 8 );
        float minuto = download / 60;

        System.out.println("O tempo estimado do download é de " + download);
        System.out.println("O tempo estimado do download é de " + minuto);

        scan.close();
    }
}
