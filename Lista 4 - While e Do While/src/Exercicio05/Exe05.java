package Exercicio05;
import java.util.Scanner;
//Escrever um algoritmo que leia uma quantidade desconhecida de
// números e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100].
// A entrada de dados deve terminar quando for lido um número negativo.
public class Exe05 {
    public static void main(String[] args) {
        int contador1=0, contador2=0, contador3=0, contador4=0, numero;
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
             numero = read.nextInt();

            if (numero >= 0 && numero <= 25) {
                contador1++;
            }else if (numero >=26 && numero <= 50) {
                contador2++;
            } else if (numero >= 51 && numero <= 75) {
                contador3++;
            } else if (numero >= 76 && numero <= 100) {
                contador4++;
            } else {
                System.out.println("Número inválido!");
            }
        }while (numero>=0);

        System.out.printf("Entre 0 e 25: %d\nEntre 26 e 50: %d\nEntre 51 e 75: %d\nEntre 76 e 100: %d"
                ,contador1,contador2,contador3,contador4);
    }
}
