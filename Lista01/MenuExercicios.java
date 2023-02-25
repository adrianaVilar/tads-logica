import java.util.Scanner;

public class MenuExercicios{
    public static void main(String[] args) {
        
        Exercicio01 exercicio01 = new Exercicio01();
        Exercicio02 exercicio02 = new Exercicio02();
        Exercicio03 exercicio03 = new Exercicio03();
        Exercicio04 exercicio04 = new Exercicio04();
        Exercicio05 exercicio05 = new Exercicio05();
        Exercicio06 exercicio06 = new Exercicio06();
        Exercicio07 exercicio07 = new Exercicio07();
        Exercicio08 exercicio08 = new Exercicio08();
        Exercicio09 exercicio09 = new Exercicio09();
        Exercicio10 exercicio10 = new Exercicio10();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor correspondente ao exercicio desejado:\n1 - Numero antecessor;\n" + 
                            "2 - Valor mais 20 por cento;\n3 - Quadrado do numero;\n" + 
                            "4 - Area do triangulo\n5 - Converter fahrenheint em celsius\n" +
                            "6 - Media ponderada\n7 - ");
        
        int numeroDoExercicio = scan.nextInt();

        switch (numeroDoExercicio) {
            case 1: exercicio01.antecessor();
            break;

            case 2: exercicio02.valorMaisVintePorCento();
            break;

            case 3: exercicio03.quadradoDoNumero();
            break;

            case 4: exercicio04.areaDoTriangulo();
            break;

            case 5: exercicio05.converterFahrenheintEmCelsius();
            break;

            case 6: exercicio06.mediaPonderada();
            break;

            case 7: exercicio07.antecessor();
            break;

            case 8: exercicio08.antecessor();
            break;

            case 9: exercicio09.antecessor();
            break;

            case 10: exercicio10.antecessor();
            break;

            default: System.out.println("O valor digitado eh invalido");
        }
    }
}