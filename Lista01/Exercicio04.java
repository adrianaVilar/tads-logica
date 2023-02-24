/* Desenvolva um algoritmo para calcular a área de um triângulo. Pensem nas
variáveis que serão necessárias. Ao final, o algoritmo deve informar a área total do
triângulo.
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        float baseTriangulo, alturaTriangulo, areaTriangulo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o valor da base do triangulo: ");

        baseTriangulo = scan.nextFloat();

        System.out.println("Agora digite o valor da altura do triangulo: ");

        alturaTriangulo = scan.nextFloat();

        areaTriangulo = alturaTriangulo * baseTriangulo / 2;
        System.out.println("O valor da area do triangulo eh: " + areaTriangulo + "!");

        scan.close();

    }
}