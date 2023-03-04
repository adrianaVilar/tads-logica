/*Escreva um programa que pergunte o raio de uma circunferência, e sem seguida
mostre o diâmetro, comprimento e área da circunferência. Considere PI = 3.141692
 */
 import java.util.Scanner;

 public class Exercicio09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float raio;
        float diametro, comprimento, areaDacircunferencia;
        float PI = 3.141692f;

        System.out.println("Digite o raio da circunferencia: ");

        raio = scan.nextFloat();        
        
        diametro = raio * 2;
        comprimento = diametro * PI;
        areaDacircunferencia = PI * (raio * raio);

        System.out.printf("Diametro: %.2f\nComprimento: %.2f\nArea: %.2f\n", diametro, comprimento, areaDacircunferencia);
    
        scan.close();
    }
 }