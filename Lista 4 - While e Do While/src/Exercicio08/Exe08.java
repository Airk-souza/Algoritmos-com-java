package Exercicio08;
//Uma empresa deseja aumentar seus preços em 20%. Faça um algoritmo que leia o código e o preço de custo de cada produto e calcule o preço novo. Calcule também,
// a média dos preços com e sem aumento. Mostre o código e o preço novo de cada produto e, no final, as médias.
// A entrada de dados deve terminar quando for lido um código de produto negativo.
import java.util.Scanner;
public class Exe08 {
    public static void main(String[] args) {
        //var
        Scanner read = new Scanner(System.in);
        double preco, novoPreco, mediaAntiga, novaMedia, somaAntigo=0, somaNovo=0;
        int codigo, contador = 0;

        //Inicio

        System.out.println("Entre com o código do produto");
        codigo = read.nextInt();

        while(codigo >0) {
            System.out.println("Preço do produto: ");
            preco = read.nextDouble();

            novoPreco = preco + (preco * 0.2);

            somaAntigo += preco;
            somaNovo += novoPreco;
            System.out.printf("O preço do produto %d foi alterado!!!\n"+
                    "Novo preço: R$%.2f",codigo ,novoPreco);

            contador++;
            System.out.println("\nDigite o codigo de outro produto: (Numero negativo para finalizar) ");
            codigo = read.nextInt();
        }
        if (contador>0) {
            mediaAntiga = (somaAntigo / contador);
            novaMedia = (somaNovo / contador);
            System.out.printf("\n%d produtos tiveram os preços alterados.",contador);
            System.out.printf("\nMédia de preços antigos: R$%.2f",mediaAntiga);
            System.out.printf("\nNova média de preços: R$%.2f\n" ,novaMedia);
        }else {
            System.out.println("Saíndo do programa!");
        }
    }
}

