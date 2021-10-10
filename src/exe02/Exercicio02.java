package exe02;
// 2-Escreva um algoritmo que calcule a soma dos números de 1 a 15.
public class Exercicio02 {
    public static void main (String []args){
        int soma = 0;

        for (int i = 0; i <=15; i++){
            soma = soma +i;
            System.out.println(soma);
        }
        System.out.println(" A soma dos números entre 1 e 15 é: " +soma);
    }
}
