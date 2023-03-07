package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex10_TurnoDeEstudo {

    //Faça um Programa que pergunte em que turno você estuda.
    // Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Em qual turno você estuda? Digite M-matutino ou V-Vespertino ou N- Noturno: ");
        String turno = scanner.nextLine().toUpperCase();

        if (turno.equals("M")){
            System.out.println("Bom Dia!");
        } else if (turno.equals("V")) {
            System.out.println("Boa Tarde!");
        } else if (turno.equals("N")) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido!");
        }
    }
}
