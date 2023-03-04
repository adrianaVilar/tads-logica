/*Ler um valor e escrever se é positivo ou negativo (considere o valor zero como
positivo).
 */
 import java.util.Scanner;

 public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor;

        System.out.println("Digite o valor que deseja saber se eh positivo ou negativo ");

        valor = scan.nextInt();

        if(valor < 0){
        System.out.println("O valor eh negativo");
        } else {
            System.out.println("O valor eh positivo");
        }
        
        scan.close();
    }
 }