/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365
dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.
a. Desafio e pesquisa: utilizando a classe Calendar ou Date do Java, peça que
o usuário informe sua data de nascimento e o sistema irá calcular quantos
anos, meses e dias a pessoa viveu.
 */
 import java.util.Scanner;

 public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float primeiroValor, segundoValor;
        float resultadoDivisao;

        System.out.println("Digite os dois valores que deseja dividir: ");

        primeiroValor = scan.nextFloat();
        segundoValor = scan.nextFloat();
        
        if(segundoValor == 0){
            System.out.println("O segundo valor eh zero. Digite um divisor diferente de zero.");
        } else {
            resultadoDivisao = primeiroValor / segundoValor;
            System.out.println("O valor da divisao eh: " + resultadoDivisao);
        }
        
        scan.close();
    }
 }