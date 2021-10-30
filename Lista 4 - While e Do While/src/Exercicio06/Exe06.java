package Exercicio06;

import java.util.Scanner;

//Faça um algoritmo que leia vários números inteiros e calcule o somatório dos números negativos. O fim da leitura será indicado pelo número 0.
public class Exe06 {
    public static void main (String [] args){
        //var
        Scanner read = new Scanner(System.in);
        int numero, somaNum=0;

        System.out.println("Digite um número inteiro: ");
        numero = read.nextInt();

        while(numero != 0){
            if (numero<0){
                somaNum += numero ;
            }else{
                System.out.println("Número positivo, será ignorado na somatória");
            }
            System.out.println("Digite um número inteiro: ");
            numero = read.nextInt();
        }
        System.out.println("Soma dos número negativos: " + somaNum);
    }
}
