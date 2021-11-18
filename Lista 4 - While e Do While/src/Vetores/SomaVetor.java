package Vetores;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar?");
        int repeat = read.nextInt();

        double[] vetor = new double[repeat];
        double soma = 0;
        //Populando o vetor e incrementando a soma
        for(int i = 0; i < repeat; i ++){
            System.out.println("Digite um número: ");
            vetor[i] = read.nextDouble();
            soma += vetor[i];// Talvez fosse interessante criar um FOR apenas para a soma das posições do vetor. COESÃO?
        }
        //Retornando os valores do vetor.
        double media = soma/repeat;
        System.out.print("\nValores: ");

        for (int i =0; i < repeat; i++){
            System.out.printf("%.2f\t", vetor[i]);
        }

        System.out.printf("\nSoma: %.2f\n", soma);
        System.out.printf("Media: %.2f", media);
        read.close();
    }
}
