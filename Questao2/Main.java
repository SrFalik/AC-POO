/*
AVALIAÇÃO CONTINUADA DE POO
FELIPE ROSMAN
MARIA GIULIA PESSANHA
 */

package Questao2;

public class Main {
    public static void main(String[] args) {
        int i, numero;

        for (i = 1; i <= 100; i++) {
            int contador = 0;
            for (numero = i; numero >= 1; numero--) {
                if (i % numero == 0) {
                    contador++;
                }
                //Verificando se é par, ou seja não é primo
            }
            if (contador == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
