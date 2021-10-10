package exe04;
//Leia o nome e um número qualquer do usuário.
// Escreva seu nome na tela a mesma quantidade de vezes do número digitado.

import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = read.next();
        System.out.println("Quantas vezes deve-se repetir?: ");
        int repeticao = read.nextInt();

        for (int i = 1; i <= repeticao; i++){
            System.out.println(nome);
        }
    }
}
