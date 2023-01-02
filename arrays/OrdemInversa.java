/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

/* no array só pode ter elementos de mesmo tipos */

public class OrdemInversa{
    public static void main(String[] args) {
      int[] vetor = {5 , 6 , 7 , -8 , 9, 12};
      
      // System.out.println(vetor.length);

      System.out.print("Vetor: ");
        int count =0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }
    }
    
}