package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex02_PositivoOuNegativo {

    //Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        Double valor = scanner.nextDouble();

        if (valor >= 0) {
            System.out.println("O número " + valor + " é positivo.");
        } else {
            System.out.println("O número " + valor + " é negativo.");
        }
    }
}
