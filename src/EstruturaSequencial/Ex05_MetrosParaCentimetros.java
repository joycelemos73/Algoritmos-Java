package EstruturaSequencial;

//Faça um Programa que converta metros para centímetros.

import java.util.Scanner;

public class Ex05_MetrosParaCentimetros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número em metros que deseja converter para centímetros: ");
        Double metros = scanner.nextDouble();

        Double centimetros = metros * 100;

        System.out.println("O número " + metros + " em centímetros é igual a " + centimetros);
    }
}
