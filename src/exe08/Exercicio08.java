package exe08;
//Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int idade;
        int contadorMaiores = 0;
        int contadorMenores = 0;
        System.out.println("Quantas idades irá digitar?");
        int rep = read.nextInt();
        System.out.println("Digite as "+rep+" idades! ");

        for (int i=1; i <= rep; i++){

            idade = read.nextInt();
            if (idade < 0 ){
                System.out.println("Idade inválida. Digite novamente");
                idade= read.nextInt();
            }

            if (idade >= 18){
                contadorMaiores++;
            }else {
                contadorMenores++;
            }

        }
        System.out.println("Pessoas maiores de idade: " + contadorMaiores);
        System.out.println("Pessoas menores de idade: " +contadorMenores);
    }
}
