package EstruturaSequencial;

//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

public class Ex02_PedirEImprimirNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Double numero = scanner.nextDouble();

        System.out.println("O número informado foi " + numero);
    }
}
