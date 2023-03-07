package EstruturaSequencial;

//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
//F = (C * 9 / 5) + 32

import java.util.Scanner;

public class Ex10_CelsiusParaFahrenheit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius  e veja a temperatura em graus Fahrenheit: ");
        Double celsius = scanner.nextDouble();

        Double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + "ºC = " + fahrenheit + "F");

    }

}
