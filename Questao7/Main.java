/*
AVALIAÇÃO CONTINUADA DE POO
FELIPE ROSMAN
MARIA GIULIA PESSANHA
 */

package Questao7;

class Main {
    public static void main(String[] args) {
        String string = "Exemplo de uso de métodos para Strings";
        for (int i = 0, len = string.length(); i < len; i++) {
            char ch = string.charAt(i);
            String str = ch + "";
            if (i % 2 == 0) {
                System.out.print(str.toUpperCase());
            } else {
                System.out.print(str.toLowerCase());
            }
        }
    }
}
