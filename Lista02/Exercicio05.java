/*Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre
eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma
mensagem de erro.
 */
 import java.util.Scanner;

 public class Exercicio05 {
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