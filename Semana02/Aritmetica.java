import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, soma, subtracao, multiplicacao, divisao, resto;

        System.out.println("Insira dois valores inteiros: ");

        a = scan.nextInt();
        b = scan.nextInt();
        
        soma = a + b;
        subtracao = a - b;
        multiplicacao = a * b;
        divisao = a / b;
        resto = a % b;

        System.out.printf("%d + %d = %d\n", a, b, soma);
        System.out.printf("%d - %d = %d\n", a, b, subtracao);
        System.out.printf("%d * %d = %d\n", a, b, multiplicacao);
        System.out.printf("%d / %d = %d\n", a, b, divisao);
        System.out.printf("%d %% %d = %d\n", a, b, resto);

        scan.close();
    }
}