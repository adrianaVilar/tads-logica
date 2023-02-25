/* Desenvolva o algoritmo de um programa para calcular a média ponderada de tres notas das
avaliações de um aluno. A primeira nota com peso 3, a segunda peso 4 e a terceira peso 5.
*/

import java.util.Scanner;

public class Exercicio06{
    public void mediaPonderada {

        float primeiraNota, segundaNota, terceiraNota, media;

        Scanner scan = new Scanner(System.in);

        System.out.println("Para calcular sua media\nDigite as tres notas: ");

        primeiraNota = scan.nextFloat();
        segundaNota = scan.nextFloat();
        terceiraNota = scan.nextFloat();

        media = (primeiraNota * 3 + segundaNota * 4 + terceiraNota * 5) / 12;

        System.out.println("Sua media eh: " + media);

        scan.close();
    }

}