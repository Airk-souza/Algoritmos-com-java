package exe10;
import java.util.Scanner;
//Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numeros, dentro=0, fora=0;
        System.out.println("Quantos números irá digitar: ");
        int repeticao = read.nextInt();
        System.out.println("Digite os " +repeticao+" números: ");
        for (int i = 1; i <= repeticao; i++){
            numeros = read.nextInt();
            if (numeros < 0 ){
                System.out.println("Números inválidos. Digite novamente");
                numeros= read.nextInt();
            }


            if (numeros >=0 && numeros <=100){
                dentro++;
            }else {
                fora++;
            }
        }
        System.out.println("Entre 0 e 100: " + dentro );
        System.out.println("Fora da faixa de 0 e 100: " +fora);

    }
}
