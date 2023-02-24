/* Construa um algoritmo que dadas as entradas: distância do trajeto e velocidade
média da viagem, informe o tempo que uma família levará saindo de sua cidade de
férias até o destino previsto. Após o cálculo, o algoritmo deve mostrar o tempo
calculado.
*/
import java.util.Scanner;

public class Exercicio07{
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        float distancia, velocidade;
        float tempoDeViagem;

        System.out.println("Digite qual a distancia que sera percorrida em km: ");

        distancia = scan.nextFloat();
        
        System.out.println("Digite a velocidade media utilizada em km/h: ");

        velocidade = scan.nextFloat();

        tempoDeViagem = distancia / velocidade;

        System.out.printf("O tempo que a viagem vai durar eh aproximadamente: %.0f horas", tempoDeViagem);

        scan.close();

    }
}