package Exercicio02;

import java.util.Scanner;

public class Exe02 {
    public static void main(String [] args){
        //variáveis
        Scanner read = new Scanner(System.in);
        int voto;
        int candidato1=0, candidato2=0, candidato3=0, candidato4=0, nulo=0, branco=0;
        //Entrada
        System.out.println("Digite o número do seu candidato: (0 para sair)");
        voto = read.nextInt();
        //L00p
        while (voto > 0) {
            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    nulo++;
                    break;
                case 6:
                    branco++;
                    break;
                default:
                    System.out.println("Dados inválidos!");
            }
            System.out.println("Digite o número do seu candidato: (0 para sair)");
            voto = read.nextInt();

        }
        //Saída
        System.out.println("RESULTADOS:");
        System.out.println("Candidato 1: "+candidato1+"\nCandidato 2: "+candidato2+"\nCandidato 3: "+candidato3
                +"\nCandidato 4: " +candidato4+ "\nNulos: "+nulo+ "\nBrancos: "+branco );
    }
}
