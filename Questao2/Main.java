/*
AVALIAÇÃO CONTINUADA DE POO
FELIPE ROSMAN
MARIA GIULIA PESSANHA
 */

package Questao2;

class Main {
    public static void main(String[] args) {
        int i;
        int numero;
        StringBuilder primos = new StringBuilder();

        for (i = 1; i <= 100; i++) {
            int contador = 0;
            for (numero = i; numero >= 1; numero--) {
                if (i % numero == 0) {
                    contador = contador + 1;
                }
            }
            if (contador == 2) {
                primos.append(i).append(" ");
            }
        }
        System.out.println(primos);
    }
}
