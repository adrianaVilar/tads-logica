/* Desenvolva o algoritmo de um programa para calcular a média de duas notas das
avaliações de um aluno.
*/

import java.util.Scanner;

public class Exercicio06{
    public static void main(String[] args) {

        float primeiraNota, segundaNota, media;

        Scanner scan = new Scanner(System.in);

        System.out.println("Para calcular sua media\nDigite a primeira nota: ");

        primeiraNota = scan.nextFloat();

        System.out.println("Digite a segunda nota: ");

        segundaNota = scan.nextFloat();

        media = (primeiraNota + segundaNota) / 2;

        System.out.println("Sua media eh: " + media);

        scan.close();
    }

}