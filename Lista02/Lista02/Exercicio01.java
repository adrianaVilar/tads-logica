/*Faça um algoritmo que converta metros para centímetros.
Lembrando que 1m = 100cm
 */
 import java.util.Scanner;

 public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int metros, centimetros;

        System.out.println("Digite qual valor deseja transformar de metros para centimetros: ");

        metros = scan.nextInt();

        centimetros = metros * 100;

        System.out.printf("%d m em centimetros eh %d cm\n", metros, centimetros);

        scan.close();
    }
 }