/*
AVALIAÇÃO CONTINUADA DE POO
FELIPE ROSMAN
MARIA GIULIA PESSANHA
 */

package Questao8;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder stringReverso = new StringBuilder();
        sc.close();
        int tamanhoString = str.length();

        for (int i = (tamanhoString - 1); i >=0; --i) {
            stringReverso.append(str.charAt(i));
            //criando um string ao contrário com stringbuilder
        }
        if (str.equalsIgnoreCase(stringReverso.toString())) {
            System.out.println("Palindromo");
            //verificando se é palíndromo ignorando minúsculo e maiúsculo
        }
        else {
            System.out.println("Não palíndromo");
        }
    }
}
