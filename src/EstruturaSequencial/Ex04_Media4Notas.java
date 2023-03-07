package EstruturaSequencial;

//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class Ex04_Media4Notas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota do aluno: ");
        Double primeiraNota = scanner.nextDouble();

        System.out.print("Digite a segunda nota do aluno: ");
        Double segundaNota = scanner.nextDouble();

        System.out.print("Digite a terceira nota do aluno: ");
        Double terceiraNota = scanner.nextDouble();

        System.out.print("Digite a quarta nota do aluno: ");
        Double quartaNota = scanner.nextDouble();

        Double media = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("-=-=-=-= BOLETIM ESCOLAR =-=-=-=-");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        System.out.println("NOTA 1:                       " + primeiraNota);
        System.out.println("NOTA 2:                       " + segundaNota);
        System.out.println("NOTA 3:                       " + terceiraNota);
        System.out.println("NOTA 4:                       " + quartaNota);
        System.out.println("");
        System.out.println("                       Média: " + media);


    }

}
