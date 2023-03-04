/*Escreva um algoritmo para ler o número total de eleitores de um município, o
número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
cada um representa em relação ao total de eleitores
 */
 import java.util.Scanner;

 public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int totalDeEleitores, votosBrancos, votosNulos, votosValidos;
        float percentualVotosBrancos, percentualVotosNulos, percentualVotosValidos;

        System.out.println("Digite a quantidade total de eleitores, quantos votos foram brancos, nulos e validos: ");

        totalDeEleitores = scan.nextInt();
        votosBrancos = scan.nextInt();
        votosNulos = scan.nextInt();
        votosValidos = scan.nextInt();
        
        percentualVotosBrancos = votosBrancos * 100 / totalDeEleitores;
        percentualVotosNulos = votosNulos * 100 / totalDeEleitores;
        percentualVotosValidos = votosValidos * 100 / totalDeEleitores;

        System.out.printf("Percentual de votos:\nBrancos: %.2f\nNulos: %.2f\nValidos: %.2f\n", percentualVotosBrancos, percentualVotosNulos, percentualVotosValidos);
    
        scan.close();
    }
 }