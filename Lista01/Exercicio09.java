/*Considere que você deseja uma comemoração especial para o seu aniversário e
assim irá convidar familiares a amigos para um churrasco na sua residência. Você
irá precisar comprar a carne a ser consumida pelos seus convidados, logo precisa
de uma forma de calcular a quantidade certa a ser adquirida.
Desenvolva o algoritmo do programa para auxiliar no cálculo da quantidade de carne
bovina (sem osso) a ser comprada considerando que homens, mulheres e crianças
consomem uma quantidades diferentes de carne.
Consumo de carne (http://www.embaixadordochurrasco.com.br/calculochurrasco): médio
Homens: 400 gramas
Mulheres: 320 gramas
Crianças: 200 gramas
*Observação: geralmente é adicionada uma margem de segurança na quantidade
de carne a ser comprada para evitar que falte. Adicione uma margem de segurança
de 20% no total de carne a ser adquirida.
*/
import java.util.Scanner;

public class Exercicio09 {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int quantidadeDeCarneHomens = 400;
        int quantidadeCarneMulheres = 320;
        int quantidadeDeCarneCriancas = 200;
        int margem = 20;

        int quantidadeHomens, quantidadeMulheres, quantidadeCriancas;

        float totalDeCarne, totalMaisMargem;

        System.out.println("Digite quantos homens serao convidados: ");

        quantidadeHomens = scan.nextInt();

        System.out.println("Digite quantas mulheres serao convidadas: ");

        quantidadeMulheres = scan.nextInt();

        System.out.println("Digite quantas criancas serao convidadas: ");

        quantidadeCriancas = scan.nextInt();

        totalDeCarne = (quantidadeHomens * quantidadeDeCarneHomens) + (quantidadeMulheres * quantidadeCarneMulheres) + (quantidadeCriancas * quantidadeCarneMulheres);
        totalMaisMargem = (totalDeCarne + (totalDeCarne * (margem / 100))) / 100;

        System.out.println("O total de carne que devera ser comprada eh de: " + totalMaisMargem + " kg");

        scan.close();

    }
}