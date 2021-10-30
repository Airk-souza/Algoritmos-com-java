package Exercicio09;

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        //var
        double alturaHomens, alturaMulheres, mediaAltH = 0, mediaAltF = 0, mediaIdadeH = 0, mediaIdadeF = 0,
                percenT = 0.0, somaAlturaMulheres = 0, somaAlturaHomens = 0, mediaIdadeGeral=0, mediaAlturaGeral=0;
        int idadeMulheres, idadeHomens, mulheres = 0, homens = 0, somaIdadeMulheres = 0, somaidadeHomens = 0, faixaEtaria = 0, somaGeralPessoas=0;
        String genero;
        Scanner read = new Scanner(System.in);
        //Execução

        System.out.println("Qual seu genero?(M ou F) ");
        genero = read.next();
        genero = genero.toUpperCase();

        while (genero.equals("F") || genero.equals("M")) {
            switch (genero) {
                case "F":
                    mulheres++;

                    System.out.println("Qual sua idade?");
                    idadeMulheres = read.nextInt();
                    somaIdadeMulheres += idadeMulheres;
                    if (idadeMulheres >= 18 && idadeMulheres <= 35) {
                        faixaEtaria++;
                    }

                    System.out.println("Qual sua altura: ");
                    alturaMulheres = read.nextDouble();
                    somaAlturaMulheres += alturaMulheres;

                    break;

                case "M":
                    homens++;

                    System.out.println("Qual sua idade?");
                    idadeHomens = read.nextInt();
                    somaidadeHomens += idadeHomens;
                    if (idadeHomens >= 18 && idadeHomens <= 35) {
                        faixaEtaria++;
                    }

                    System.out.println("Qual sua altura: ");
                    alturaHomens = read.nextDouble();
                    somaAlturaHomens += alturaHomens;

                    break;
                default:
                    System.out.println("Dados inválidos.");
            }
            System.out.println("Qual seu genero?(M ou F) ");
            genero = read.next();
            genero = genero.toUpperCase();

        }
        if (mulheres > 0 && homens > 0) {
            //medias alturas
            mediaAltF = (somaAlturaMulheres / mulheres);
            mediaAltH = (somaAlturaHomens / homens);
            //media idades
            mediaIdadeF = (float)(somaIdadeMulheres / mulheres);
            mediaIdadeH = (float)(somaidadeHomens / homens);
            somaGeralPessoas = (mulheres + homens);
            percenT = ((float)(faixaEtaria * 100) / somaGeralPessoas);
             mediaIdadeGeral = ((float)(somaIdadeMulheres+somaidadeHomens)/somaGeralPessoas);
             mediaAlturaGeral = ((float)(somaAlturaHomens+somaAlturaMulheres)/somaGeralPessoas);
        }else{
                System.out.println("Saindo do sistema!");
            }

            System.out.println("\n=====================================\n");
            System.out.println("Medias dos homens: ");
            System.out.printf("Media de idades: %.2f anos.", mediaIdadeH);
            System.out.printf("\nMedia de Altura: %.2f metros. \n", mediaAltH);
            System.out.println("\n=====================================\n");
            System.out.println("Medias das mulheres: ");
            System.out.printf("Media de idades: %.2f anos.", mediaIdadeF);
            System.out.printf("\nMedia de Altura: %.2f metros.", mediaAltF);
            System.out.println("\n=====================================\n");
            System.out.printf("\nMedia de idade geral: %.2f. anos" ,mediaIdadeGeral);
            System.out.printf("\nMedia de altura geral: %.2f. metros" ,mediaAlturaGeral);
            System.out.println("\nPessoas entrevistadas: "+ somaGeralPessoas);
            System.out.printf("Porcentagem de pessoas entre 18 e 35: %.2f%%.", percenT);
            System.out.println("\n=====================================\n");

        }
}