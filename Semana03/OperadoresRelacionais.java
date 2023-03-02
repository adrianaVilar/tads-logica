import java.util.Scanner;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* a resposta ao utilizar um operador relacional sera
        SEMPRE um boolen */
        boolean resultado;

        resultado = 5 > 3;

        System.out.println("Resultado: " + resultado);

        scan.close();

        /* Operadores mais usados:
        >       maior?
        >=      maior ou igual?
        <       menor?
        <=      menor ou igual?
        ==      igual?
        !=      diferente?
        */      
    }
}