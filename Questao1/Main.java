/*
AVALIAÇÃO CONTINUADA DE POO
FELIPE ROSMAN
MARIA GIULIA PESSANHA
 */

package Questao1;

class Main {
    public static void main(String[] args) {
        int numero1 = 0, numero2 = 1;
            for (int i = 0; i < 15; i++) {
            //Fibonacci = Os dois números anteriores somados é igual ao próximo número
            System.out.print(numero1 + " ");
            int numero3 = numero2 + numero1;
            //Setando o próximo número
            numero1 = numero2;
            numero2 = numero3;
            //Igualando os números para fazer próximo número da sequência
            }

    }
}