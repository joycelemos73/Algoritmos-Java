package EstruturaSequencial;

//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06_AreaCirculo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo para saber sua área: ");
        Double raioCirculo = scanner.nextDouble();

        Double areaCirculo = Math.pow(raioCirculo, 2) * Math.PI;

        System.out.println("Se o raio tem valor " + raioCirculo + ", sua área será de " +  areaCirculo);

    }
}
