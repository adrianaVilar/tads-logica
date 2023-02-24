/* Desenvolva o algoritmo para calcular o resultado de uma eleição de um municipal.
A entrada de dados será:
- Número total de eleitores;
- Número de votos válidos;
- Número de votos brancos;
- Número de votos nulos.
O algoritmo deve calcular e exibir para o usuário as seguintes informações (em
relação ao total de eleitores):
- Percentual de votos válidos;
- Percentual de votos brancos;
- Percentual de votos nulos;
*/

import java.util.Scanner;

public class Exercicio08{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int totalEleitores, votosValidos, votosBrancos, votosNulos;

        float percentualVotosValidos, percentualVotosBrancos, percentualVotosNulos;

        System.out.println("Digite a quantidade total de eleitores: ");

        totalEleitores = scan.nextInt();

        System.out.println("Digite a quantidade de votos validos: ");

        votosValidos = scan.nextInt();

        System.out.println("Digite a quantidade de votos brancos: ");

        votosBrancos = scan.nextInt();

        System.out.println("Digite a quantidade de votos nulos: ");

        votosNulos = scan.nextInt();

        percentualVotosValidos = totalEleitores * votosValidos / 100;
        percentualVotosBrancos = totalEleitores * votosBrancos / 100;
        percentualVotosNulos = totalEleitores * votosNulos / 100;

        System.out.println("O percentual de votos validos eh: " + percentualVotosValidos + "%");
        System.out.println("O percentual de votos brancos eh: " + percentualVotosBrancos + "%");
        System.out.println("O percentual de votos nulos eh: " + percentualVotosNulos + "%");

        scan.close();
    }
}