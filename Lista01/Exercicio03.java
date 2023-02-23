/*Desenvolva o algoritmo de um programa onde o usuário irá informar um número
inteiro e o programa deve calcular e exibir quadrado do número informado pelo
usuário.
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int numeroDigitado, quadradoDoNumero;

        System.out.println("Digite um valor para descobrir o seu quadrado: ");

        numeroDigitado = scan.nextInt();

        quadradoDoNumero = numeroDigitado * numeroDigitado;

        System.out.println("O quadrado de " + numeroDigitado + " eh " + quadradoDoNumero);

        scan.close();

    }
}