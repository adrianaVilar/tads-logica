/*Desenvolva o algoritmo de um programa onde o usuário irá informar um número
inteiro e o programa deve calcular e exibir o número imediatamente antecessor ao
número digitado pelo usuário. 
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        int numDigitado, antecessorDoNumDigitado;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero que deseja verificar o antecessor: ");

        numDigitado = scan.nextInt();

        antecessorDoNumDigitado = numDigitado - 1;

        System.out.println("O antecessor do numero digitado eh: " + antecessorDoNumDigitado);

        scan.close();
    }
}