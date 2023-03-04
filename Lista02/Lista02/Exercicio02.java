/*Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
calcular e escrever a área e o perímetro do retângulo.
 */
 import java.util.Scanner;

 public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int base, altura, areaRetangulo, perimetroRetangulo;

        System.out.println("Digite o valor da base e em seguida da altura do retangulo: ");

        base = scan.nextInt();
        altura = scan.nextInt();

        areaRetangulo = base * altura;
        perimetroRetangulo = 2 * (base + altura);

        System.out.printf("A area do retangulo eh %d\nO perimetro do retangulo eh %d\n", areaRetangulo, perimetroRetangulo);

        scan.close();
    }
 }