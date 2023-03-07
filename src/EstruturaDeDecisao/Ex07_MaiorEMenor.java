package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex07_MaiorEMenor {

    //Faça um Programa que leia três números e mostre o maior e o menor deles.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int maior = 0;
        int menor = 0;

        while (contador < 3) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            contador++;

            if (contador == 1){
                maior = menor = numero;
            } else if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }


        }

        System.out.println("O maior número digitado foi " + maior);
        System.out.println("O menor número digitado foi " + menor);
    }
}
