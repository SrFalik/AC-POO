/*
AVALIAÇÃO CONTINUADA DE POO
FELIPE ROSMAN
MARIA GIULIA PESSANHA
 */

package Questao6;

class Main {

    public static void main(String[] args) {
        String texto = "Os nomes das classes em java precisam começar com uma letra e depois destas quaisquer combinações de letras e dígitos. Como padrão, os nomes são substantivos que iniciam com uma letra maiúscula. Para as constantes é costume utilizar sempre letras maiúsculas nos nomes.";

        long qtd = texto.chars().filter(l -> l == 'a' || l == 'A' || l == 'ã' || l == 'á' || l == 'â').count();

        System.out.println(qtd);
    }

}