package Exercicio10;

import java.util.Scanner;

//10) Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre;
//a quantidade de pessoas com mais de 90 quilos;
//a média das idades das sete pessoas
public class Exe10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int idade, maisNoventa = 0, somaIdades=0;
        double peso, mediaIdades;

        for (int i = 1; i <=7; i++){

            System.out.println("Digite sua idade: ");
             idade = read.nextInt();
             somaIdades += idade;
            System.out.println("Digite seu peso:(Kg) ");
            peso = read.nextDouble();

            if (peso > 90){
                maisNoventa++;
            }

        }
        mediaIdades = ((float)somaIdades/7);

        System.out.println("Pessoas com mais de noventa quilos: "+maisNoventa);
        System.out.printf("Media de idades dos participantes: %.2f " ,mediaIdades);
    }
}
