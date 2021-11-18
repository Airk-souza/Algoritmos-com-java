package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int nota, somaNota = 0, codigo;
        float media;
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o código: ");
        codigo = read.nextInt();

        while (codigo !=0) {
            for (int i = 0; i <= 2; i++) {
                System.out.println("Digite a nota do aluno: ");
                nota = read.nextInt();
                somaNota = nota + somaNota;
            }
            media = (float) somaNota / 3;
            System.out.printf("Média: %.2f\n",media);

            System.out.println("Digite o código do aluno: ");
            codigo = read.nextInt();
        }

        System.out.println("Código 0: SAINDO DO PROGRAMA");

    }
}
