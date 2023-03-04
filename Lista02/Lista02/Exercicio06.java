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

        int anos, meses, dias;
        int anosEmDias, mesesEmDias, diasJaVividos;

        System.out.println("Digite quantos anos, meses e dias de idade a pessoa tem: ");

        anos = scan.nextInt();
        meses = scan.nextInt();
        dias = scan.nextInt();
        
        anosEmDias = anos * 365;
        mesesEmDias = meses * 30;

        diasJaVividos = anosEmDias + mesesEmDias + dias;

        System.out.printf("Essa pessoa ja viveu %d dias\n", diasJaVividos);
    
        scan.close();
    }
 }