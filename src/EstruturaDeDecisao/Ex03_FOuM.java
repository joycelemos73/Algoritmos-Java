package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex03_FOuM {
    //Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite F para Feminino ou M para Masculino: ");
        String letra = scanner.nextLine().toUpperCase();

        if (letra.equals("F")) {
            System.out.println("F - Feminino");
        } else if (letra.equals("M")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }
    }
}
