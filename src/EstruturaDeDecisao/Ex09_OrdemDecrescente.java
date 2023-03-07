package EstruturaDeDecisao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex09_OrdemDecrescente {

    //Faça um Programa que leia três números e mostre-os em ordem decrescente.

    public static void main(String[] args) {

        int contador = 0;
        int maiorNumero = 0;
        int menorNumero = 0;

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        while (contador < 3) {
            System.out.println("Digite um número: ");
            numeros.add(scanner.nextInt());

            contador++;
        }

        Collections.sort(numeros);

        System.out.println(numeros);

    }
}
