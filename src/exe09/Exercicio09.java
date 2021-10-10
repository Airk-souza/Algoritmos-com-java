package exe09;
import java.util.Scanner;
//Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares.
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numeros, pares=0, impares=0;
        System.out.println("Quantos números irá digitar: ");
        int repeticao = read.nextInt();
        System.out.println("Digite os " +repeticao+" números: ");
        for (int i = 1; i <= repeticao; i++){
            numeros = read.nextInt();
            if (numeros < 0 ){
                System.out.println("Números inválidos. Digite novamente");
                numeros= read.nextInt();
            }


            if (numeros%2 == 0){
                pares++;
            }else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares );
        System.out.println("Impares: " +impares);
    }
}
