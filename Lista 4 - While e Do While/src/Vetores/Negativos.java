package Vetores;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        int repeticoes = read.nextInt();
        int[] negativos = new int[repeticoes];

        for (int i = 0; i < repeticoes; i++){
            System.out.println("Digite um número: ");
            int numeros = read.nextInt();

            negativos[i] = numeros;
        }

        for (int negativo : negativos) {
            if (negativo < 0) {
                System.out.println("Numeros negativos: ");
                System.out.println(negativo);
            }
        }
        read.close();

    }
}
