/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365
dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.
a. Desafio e pesquisa: utilizando a classe Calendar ou Date do Java, peça que
o usuário informe sua data de nascimento e o sistema irá calcular quantos
anos, meses e dias a pessoa viveu.
 */
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

 public class Exercicio06a {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String dataNascimento;
        Date diaHoje, dataNascimentoEmDate;
        Long diasJaVividos;

        System.out.println("Digite a data de nascimento da pessoa no formato 'dd/MM/AAAA': ");

        dataNascimento = scan.next();
        
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        dataNascimentoEmDate = formataData.parse(dataNascimento);

        diaHoje = new Date();

        diasJaVividos = diaHoje.getTime() - dataNascimentoEmDate.getTime();

        System.out.printf("Essa pessoa ja viveu %d dias\n", diasJaVividos);
    
        scan.close();
    }
 }