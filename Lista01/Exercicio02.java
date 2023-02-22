import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){

        int numDigitado, numMaisVintePorCento;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero que deseja acrescentar 20%: ");

        numDigitado = scan.nextInt();

        numMaisVintePorCento = numDigitado + (numDigitado * 20 / 100);

        System.out.println("O valor digitado mais 20% eh: " + numMaisVintePorCento);

        scan.close();

    }
}