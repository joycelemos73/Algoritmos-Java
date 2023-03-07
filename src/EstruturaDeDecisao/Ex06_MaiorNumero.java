package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex06_MaiorNumero {

    //Faça um Programa que leia três números e mostre o maior deles.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int maior = 0;

        while (contador < 3) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            contador++;

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número digitado foi " + maior);

    }
}
