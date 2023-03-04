/*Faça um programa que receba dois números e efetua a adição. Caso o valor
somado seja maior que 20, este deverá ser apresentado somando-se a ele 8; caso
o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 10.
 */
 import java.util.Scanner;

 public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float num1, num2;
        float somaDosNumeros, resultadoComModificacao;

        System.out.println("Digite dois numeros: ");

        num1 = scan.nextFloat();  
        num2 = scan.nextFloat();      
        
        somaDosNumeros = num1 + num2;

        if (somaDosNumeros > 20) {
            resultadoComModificacao = somaDosNumeros + 8;
        } else {
            resultadoComModificacao = somaDosNumeros - 10;
        }

        System.out.printf("O valor é %.2f\n", resultadoComModificacao);
    
        scan.close();
    }
 }