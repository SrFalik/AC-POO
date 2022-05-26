/*
AVALIAÇÃO CONTINUADA DE POO
FELIPE ROSMAN
MARIA GIULIA PESSANHA
 */

package Questao4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a circunferência");
        double circ = sc.nextDouble();
        System.out.println("Digite o diâmetro");
        double diam = sc.nextDouble();
        double pi = circ/diam;
        System.out.println(pi);
        System.out.println();
        System.out.println("Usando função Math.PI()");
        System.out.println(Math.PI);
    }
}

