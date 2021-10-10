package exe05;

import java.util.Scanner;

//Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int leitor;
        int soma = 0;
        System.out.println("Digite os 10 números: (Um por vez)");

        for( int i = 1; i <= 10; i++) {
            leitor = read.nextInt();
            soma = soma + leitor;
        }
        System.out.println("Soma dos 10 números: " +soma);
    }

}

