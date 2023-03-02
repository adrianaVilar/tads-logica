/*Faça um programa que receba a idade de um nadador e classifique-o numa das
seguintes categorias:
• Adulto (idade >= 18);
• Juvenil (idade >= 14 e idade < 18);
• Infantil (idade >=9 e idade < 14);
• Mirim (Idade < 9).
 */
 import java.util.Scanner;

 public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade que deseja descobrir a categoria: ");

        idade = scan.nextInt();
        
        if(idade < 0) {
            System.out.println("Digite uma idade valida");
        } else if(idade >= 18) {
            System.out.println("Adulto");
        } else if(18 > idade && idade >= 14) {
            System.out.println("Juvenil");
        } else if(14 > idade && idade >= 9) {
            System.out.println("Infantil");
        } else {
            System.out.println("Mirim");
        }
        
        scan.close();
    }
 }