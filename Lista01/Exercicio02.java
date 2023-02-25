//O algoritmo deve ter como entrada um número real e a saída deve ser o valor atualizado com os 20%.

import java.util.Scanner;

public class Exercicio02 {
    public void valorMaisVintePorCento{

        float numDigitado, numMaisVintePorCento;
        final float TAXA_EM_PORCENTAGEM = 20;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero que deseja acrescentar " + TAXA_EM_PORCENTAGEM + "%");

        numDigitado = scan.nextFloat();

        //é o mesmo que digitar numDigitado + (numDigitado * TAXA_EM_PORCENTAGEM/100)
        numMaisVintePorCento = numDigitado * (1 + TAXA_EM_PORCENTAGEM/100);

        System.out.println("O valor digitado mais " + TAXA_EM_PORCENTAGEM + "% eh: " + numMaisVintePorCento);

        scan.close();

    }
}