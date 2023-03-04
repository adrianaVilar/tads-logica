/*Faça um algoritmo que pergunte quanto a pessoa ganha por hora (salário por hora)
e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
referido mês e qual será seu salário atual. Calcule também o salário líquido
(desconto de impostos) considerando 15% de impostos e mostre esses valores.
a. Pergunte ao usuário qual a % de imposto que é descontada do salário.
 */
 import java.util.Scanner;

 public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float salarioPorHora, horasTrabalhadas;
        float salarioBruto, salarioLiquido;
        int imposto;

        System.out.println("Digite qual o salario por hora, quantas horas foram trabalhadas e qual o valor do imposto: ");

        salarioPorHora = scan.nextFloat();
        horasTrabalhadas = scan.nextFloat();
        imposto = scan.nextInt();
        
        salarioBruto = salarioPorHora * horasTrabalhadas;
        salarioLiquido = salarioBruto * (imposto / 100);

        System.out.printf("Valores do salario\nBruto: R$%.2f\nLiquido: R$%.2f", salarioBruto, salarioLiquido);
    
        scan.close();
    }
 }