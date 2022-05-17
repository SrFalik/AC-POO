/*
AVALIAÇÃO CONTINUADA DE POO
FELIPE ROSMAN
MARIA GIULIA PESSANHA
 */

package Questao5;

public class Main {
    public static void main(String[] args) {
        long n = 1, p;
        int qtd = 0;
        while (qtd < 4) {
            //while para verificar se o número é perfeito, até 4 números
            p = perfeito(n);
            if (p == n) {
                System.out.println(n);
                qtd++;
            }
                n++;
        }
    }
    static long perfeito(long numero) {
        //Método para verificar número perfeito
        long soma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
