package EstruturaDeRepeticao;

//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
// O usuário deve informar de qual numero ele deseja ver a tabuada.

import java.util.Scanner;

public class Ex12_1_Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero cuja tabuada voce deseja ver: ");
        int numero = scanner.nextInt();

        for (int i=1; i<= 10; i++){
            System.out.printf("%d * %d = %d", numero, i, numero*i).println();
        }

    }

}
