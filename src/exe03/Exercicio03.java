package exe03;
//Leia o nome do usuário e escreva o nome dele na tela 10 vezes.
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = read.next();
        for (int i = 1; i <=10; i++){
            System.out.println("Seu nome é: " +nome);
        }

    }
}
