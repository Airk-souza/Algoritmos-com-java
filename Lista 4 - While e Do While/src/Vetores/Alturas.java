package Vetores;

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        //Objetos e variáveis
        Scanner read = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas?  ");
        int repeat = read.nextInt();
        String[] nomes = new String[repeat];
        int[] idades = new  int[repeat];
        double[] alturas = new  double[repeat];
        double somaAlturas = 0;

        //Laço de entrada de dados e população dos vetores
        for (int i = 0; i < repeat; i++){
            System.out.printf("Dados da %da pessoa: \n" ,i+1);
            System.out.print("Nome: ");
            nomes[i] = read.next();
            System.out.print("Idade: ");
            idades[i] = read.nextInt();
            System.out.print("Altura: ");
            alturas[i] = read.nextDouble();

        }
        //calculando e exibindo a média da alturas
        for (int i = 0; i < repeat; i++){
            somaAlturas += alturas[i];
        }
        double mediaAlturas = somaAlturas/ repeat;
        System.out.printf("\nAltura média: %.2f\n",mediaAlturas);

        // Calculando a porcentagem de pessoas menores de 16;
        int menoresDezesseis = 0;
        for (int i = 0; i < repeat; i++){
            if (idades[i] < 16){
                menoresDezesseis++;
            }
        }
        float percentTeens = (float)((menoresDezesseis*100)/repeat);
        System.out.printf("Pessoas com menos de 16: %%%.2f  \n", percentTeens);

        //Exibindo os nomes dos menores de idade
        for (int i = 0 ; i<repeat; i++){
            if (idades[i]<16){
                System.out.println(nomes[i]);
            }
        }
    read.close();
    }
}
