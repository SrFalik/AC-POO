/*
AVALIAÇÃO CONTINUADA DE POO
FELIPE ROSMAN
MARIA GIULIA PESSANHA
 */

package Questao1;

class Main {
    public static void main(String[] args) {
        int numero1 = 0, numero2 = 1;
        int contador = 0;
        while (contador < 15) {
            System.out.print(numero1 + " ");
            int numero3 = numero2 + numero1;
            numero1 = numero2;
            numero2 = numero3;
            contador = contador + 1;
        }

    }
}