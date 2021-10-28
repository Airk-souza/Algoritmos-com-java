package Exercicio04;
import java.util.Scanner;
//Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem pares. Termine a leitura se o usuário digitar zero (0).
public class Exe04 {
    public static void main(String[] args) {
            int numero, somaNumero=0, contador=0;
            float media;
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = read.nextInt();

        do {
            if (numero % 2 == 0) {
                somaNumero = numero + somaNumero;
                contador++;
            } else {
                System.out.println("O número digitado é um número impar!");
            }
            System.out.println("Digite um número: ");
            numero = read.nextInt();
        }while (numero!=0);

        media = (float) somaNumero / contador;

        if (media > 0) {
            System.out.printf("Média: %.2f", media);
        }else{
            System.out.println("Dados inválidos, impossível calcular média.");
        }
    }
}
