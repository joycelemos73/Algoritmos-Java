package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex01_ValorInvalido {


//Faça um programa que peça uma nota, entre zero e dez.
// Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota entre 0 e 10: ");
        Double nota = scanner.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Tente novamente");

            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();
        }
    }
}
