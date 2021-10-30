package Exercicio07;
//Faça um algoritmo que leia vários números inteiros e positivos e calcule o produtório dos números pares. O fim da leitura será indicado pelo número 0.
import java.util.Scanner;
public class Exe07 {
    public static void main(String[] args) {
        //Var
        Scanner read = new Scanner(System.in);
        int numero, prodNum = 1;

        System.out.println("Digite um número inteiro: ");
        numero = read.nextInt();

        while (numero != 0){

            if (numero>0){
                prodNum *= numero;
            }else {
                System.out.println("Numero negativo! Não será considero para o produto.");
            }
            System.out.println("Digite um número inteiro: ");
            numero = read.nextInt();
        }
        if (prodNum > 1) {
            System.out.println("Produto: " + prodNum);
        }else{
            System.out.println("Rotina cancelada");
        }
    }
}
