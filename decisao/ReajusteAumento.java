package decisao;
/*As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver
o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, 
baseado no salário atual:
- salários até R$ 280,00 (incluindo) : aumento de 20%
- salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
- salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
- salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
SAIDA: 
- o salário antes do reajuste;
- o percentual de aumento aplicado;
- o valor do aumento;
- o novo salário, após o aumento. */

import java.util.Scanner;

public class ReajusteAumento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Reajuste salárial: ");
        System.out.println("Informe o salario atual.");
        double salario = scan.nextDouble();

        String percentualAumento = " ";
        double valorAumento = 0;
        double novoSalario = 0;

        if(salario <= 280.00){
            percentualAumento = "20%";
            valorAumento = salario * 20/100;
            novoSalario = salario + valorAumento;
        }
        else if(salario > 280.00 && salario < 700.00){
            percentualAumento = "15%";
            valorAumento = salario * 15/100;
            novoSalario = salario + valorAumento;
        }
        else if(salario > 700.00 && salario < 1500.00){
            percentualAumento = "10%";
            valorAumento = salario * 10/100;
            novoSalario = salario + valorAumento;
        }
        else if(salario >= 1500.00){
            percentualAumento = "05%";
            valorAumento = salario * 5/100;
            novoSalario = salario + valorAumento;
        }




        System.out.println("Salário atual: " + salario);
        System.out.println("Percentual de aumento: " + percentualAumento);
        System.out.println("Valor de aumento: " + valorAumento);
        System.out.println("Salário novo: " + novoSalario);

        scan.close();
        
    }
}
