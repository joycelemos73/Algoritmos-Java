package EstruturaSequencial;

//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9).

import java.util.Scanner;

public class Ex09_FahrenheitParaCelsius {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit e veja a temperatura em graus Celsius: ");
        Double fahrenheit = scanner.nextDouble();

        Double celsius = 5 * ((fahrenheit-32) / 9);

        System.out.println(fahrenheit + "F = " + celsius + "ºC");


    }

}
