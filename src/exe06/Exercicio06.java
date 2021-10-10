package exe06;
import java.util.Scanner;
//Leia a idade de 20 pessoas e exiba a soma das idades.
public class Exercicio06 {
    public static void main (String [] args){
        Scanner read = new Scanner(System.in);
        int entrada;
        int soma = 0;

        System.out.println("Digite as 20 idades (uma por vez): ");

        for (int i = 1; i <=20; i++){
            entrada = read.nextInt();
            soma = soma + entrada;
        }
        System.out.println("A soma das 20 idades é: " + soma);
    }
}
