package Exercicio01;
// Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos.
// O final da leitura acontecerá quando for lido um valor negativo.

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        int numero, contador = 0, soma=0;
        Scanner read = new Scanner(System.in);
        System.out.println("Digite os numeros (Um número negativo para sair)");
        numero = read.nextInt();

        while (numero >= 0){
             soma = numero + soma;
             contador++;
             numero = read.nextInt();
        }

        float media = (float)soma/contador;

        System.out.println("Media: "+ media + "\nSoma dos números: " +soma +"\nQuantidade de números: "+ contador);
    }
}
