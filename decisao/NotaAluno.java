package decisao;
/*Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez. */

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner avaliação = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = avaliação.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = avaliação.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 7.0){
            System.out.println("Aprovado.");
        }
        if(media < 7.0){
            System.out.println("Reprovado.");
        }
        else if(media == 10.0){
            System.out.println("Aprovado com distinção.");
        }

        avaliação.close();
    }
}
