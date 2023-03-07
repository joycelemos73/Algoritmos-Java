package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex04_VogalOuConsoante {

    //Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = scanner.nextLine().toUpperCase();

        switch (letra) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("Essa letra é uma vogal.");
                break;
            default:
                System.out.println("Essa letra é uma consoante.");
        }
    }
}
