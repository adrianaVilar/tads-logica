/* Desenvolva um algoritmo que será utilizado para automatizar o cálculo do público e
da renda total de um evento esportivo. Este evento esportivo possui um valor fixo
cobrado por ingresso, no entanto, os sócios do clube em cujas dependências ocorre
o evento possuem um desconto de 30% no valor do ingresso e as crianças menores
de 10 anos não pagam ingresso. Baseado nos dados acima apresentados o usuário
deverá digitar 4 informações de entrada para o sistema, são elas:
- Valor de cada ingresso
- Número de pessoas (público do evento) que são sócias do clube
- Número de pessoas (público do evento) não pagantes (menores de 10 anos)
- Número de pessoas (público do evento) pagantes (sem desconto algum)
O algoritmo deverá calcular e exibir o público total do evento, a renda total do evento
e o valor que deixou de ser arrecadada devido aos descontos e isenções.
*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        
        final float TAXA_DESCONTO_SOCIOS = 30;

        float valorDoIngresso;
        int pessoasSocias, pessoasNaoPagantes, pessoasPagantes;
        int publicoTotal;
        float rendaDoEvento, valorDoDesconto, taxaConvertida;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do ingresso: ");

        valorDoIngresso = scan.nextFloat();

        System.out.println("Digite quantas pessoas socias estavam presentes: ");

        pessoasSocias = scan.nextInt();

        System.out.println("Digite quantas pessoas nao pagantes estavam presentes: ");

        pessoasNaoPagantes = scan.nextInt();

        System.out.println("Digite quantas pessoas pagantes estavam presentes: ");

        pessoasPagantes = scan.nextInt();

        publicoTotal = pessoasSocias + pessoasPagantes + pessoasNaoPagantes;
        taxaConvertida = ((TAXA_DESCONTO_SOCIOS - 100) * - 1) / 100;
        rendaDoEvento = (pessoasSocias * (valorDoIngresso * taxaConvertida)) + (pessoasPagantes * valorDoIngresso);
        valorDoDesconto = (publicoTotal * valorDoIngresso) - rendaDoEvento;

        System.out.println("O publico total do evento foi de: " + publicoTotal + " pessoas");
        System.out.printf("A renda do evento foi: R$%.2f", rendaDoEvento);
        System.out.printf("%nO valor dado de desconto no evento foi: R$%.2f", valorDoDesconto);

        scan.close();

    }
}