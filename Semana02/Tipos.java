import java.util.Scanner;

public class Tipos {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Sobre tipos!");

        //principais primitivos:
        //primitivos começam com letra minuscula
        //valores negativos e positivos entre ~2.5b
        int numeroInteiro;
        System.out.println("Informe um numero inteiro: ");
        numeroInteiro = scan.nextInt();

        //valores positivos e negativos com 8 casas decimais
        float numeroRealBaixaPrecisao = 1.12345678f;
        System.out.println("Informe um float: ");
        numeroRealBaixaPrecisao = scan.nextFloat();

        //igual ao float, mas com mais precisao (30 e poucas casas)
        double numeroRealAltaPrecisao = 1.1234567891;
        System.out.println("Informe um double: ");
        numeroRealAltaPrecisao = scan.nextDouble();

        //verdadeiro ou falso
        boolean verdadeiroOuFalso = true;
        System.out.println("Informe um boolean: ");
        verdadeiroOuFalso = scan.nextBoolean();

        System.out.println("O computador entendeu todas as entradas.");

        //Outro tipos:
        //short
        //byte
        //long (usado para contar nano segundos desde 1970, pq cabe muita informacao)


        //Tipos de texto:

        //Letra
        char umaLetra = 'A';
        //Texto
        String textos = "Isso eh um exemplo\nde texto que tem\nquebras de linha\n\te tambem tabulacoes";

        //NAO FUNCIONA!
        //umaLetra = scan.nextChar();
        //pega uma palavra e pega a primeira letra
        umaLetra = scan.next().charAt(0);
        
        //uma palavra
        textos = scane.next();

        //uma linha
        textos = scan.nextLine();

        
        System.out.println(textos);

        scan.close();
    }
}