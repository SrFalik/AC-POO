/*
AVALIAÇÃO CONTINUADA DE POO
FELIPE ROSMAN
MARIA GIULIA PESSANHA
 */

package Questao7;

public class Main {
    public static void main(String[] args) {
        String string = "Exemplo de uso de métodos para Strings";
        for (int i = 0, len = string.length(); i < len; i++) {
            //for para percorrer a string inteira em char
            char ch = string.charAt(i);
            String str = ch + "";
            if (i % 2 == 0) {
                System.out.print(str.toUpperCase());
                //se for par vai pra upper case
            } else {
                System.out.print(str.toLowerCase());
                //se for ímpar vai pra lower case
            }
        }
    }
}
