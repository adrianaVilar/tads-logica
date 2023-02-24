/* Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit para
graus Celsius.
A fórmula para conversão é a seguinte:
C/5 = (F-32)/9
Onde: 
C = temperatura em graus Celsius;
F = temperatura em graus Fahrenheit.
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        float temperaturaCelsius, temperaturaFahrenheit;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Fahrenheit que deseja converter para graus Celsius: ");

        temperaturaFahrenheit = scan.nextFloat();

        temperaturaCelsius = ((temperaturaFahrenheit - 32) / 9) * 5;

        System.out.println(temperaturaFahrenheit + " graus Fahrenheit em graus Celsius eh: " + temperaturaCelsius);
        
        scan.close();

    }
}