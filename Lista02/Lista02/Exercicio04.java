/*Escreva um programa que faça a leitura de dois valores inteiros e descubra qual
deles é o maior, imprimindo na resposta o nome da variável e o seu valor.
 */
 import java.util.Scanner;

 public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int primeiroValor, segundoValor;

        System.out.println("Digite os dois valores que deseja comparar: ");

        primeiroValor = scan.nextInt();
        segundoValor = scan.nextInt();

        if(primeiroValor > segundoValor){
        System.out.println("O primeiro valor eh o maior: " + primeiroValor);
        } else {
            System.out.println("O segundo valor eh o maior: " + segundoValor);
        }
        
        scan.close();
    }
 }