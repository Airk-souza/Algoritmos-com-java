package exe07;
import java.util.Scanner;
//Leia a idade de 20 pessoas e exiba a média das idades.

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int soma=0, entrada,intervalo;
        float media=0;
        System.out.println("Quantas idades você vai digitar? ");
        intervalo = read.nextInt();
        System.out.println("Digite as " +intervalo+ " idades (uma por vez): ");
        for (int i = 1; i <=intervalo; i++){
            entrada = read.nextInt();
            soma= soma + entrada;
            media = (float)soma / intervalo;
        }
        System.out.println("A média de idade é de: "+media+" anos.");
    }
}
