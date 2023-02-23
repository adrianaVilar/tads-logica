import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {

        int idade, idadeAnoPassado;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua idade, para descobrir a sua idade no ano passado: ");

        idade = scan.nextInt();

        idadeAnoPassado = idade -1;

        System.out.println("Sua idade no ano passado era: " + idadeAnoPassado + " anos.");

        scan.close();
    }
}