/*
AVALIAÇÃO CONTINUADA DE POO
FELIPE ROSMAN
MARIA GIULIA PESSANHA
 */

package Questao4;

public class Main {

    public static void main(String[] args) {
        //Série de Leibniz
        int repeticoes = 2147483647;
        double pi = 0;
        double denominador = 1;

        for (int contador = 0; contador < repeticoes; contador++) {

            if (contador % 2 == 0) {
                pi = pi + (1 / denominador);
            } else {
                pi = pi - (1 / denominador);
            }
            denominador = denominador + 2;
        }
        pi = pi * 4;
        System.out.println(pi);
    }
}

