package EstruturaSequencial;

//Faça um Programa que peça dois números e imprima a soma.

import java.util.Scanner;

public class Ex03_ImprimirSoma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Double primeiroNumero = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        Double segundoNumero = scanner.nextDouble();

        Double soma = primeiroNumero + segundoNumero;

        System.out.println("A soma entre " + primeiroNumero + " e " + segundoNumero + " tem como resultado o valor " + soma);

    }
}
