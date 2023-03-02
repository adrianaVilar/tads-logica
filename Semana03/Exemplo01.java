/* Um ingresso para um evento custa 100 reais
Criancas a baixo de 14 anos pagam meia

Faca um programa que dada a idade de uma pessoa,
indique o valor a ser pago
*/
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        
        int idade;
        float VALOR_INGRESSO = 100f;
        float valorMeioIngresso;
        boolean pagaMeia;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa: ");

        idade = scan.nextInt();
        valorMeioIngresso = VALOR_INGRESSO / 2;
        pagaMeia = idade <= 14;

        if(pagaMeia){
            System.out.printf("R$ %.2f\n", valorMeioIngresso);
        } else {
            System.out.printf("R$ %.2f\n", VALOR_INGRESSO);
        }

        scan.close();

    }
}