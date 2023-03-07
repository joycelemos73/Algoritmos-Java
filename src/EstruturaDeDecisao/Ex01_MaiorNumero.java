package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex01_MaiorNumero {

    //Faça um Programa que peça dois números e imprima o maior deles.


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Primeiro número: ");
            int n1 = scanner.nextInt();

            System.out.print("Segundo número: ");
            int n2 = scanner.nextInt();

            if (n1 > n2) {
                System.out.println("O maior número é " + n1);
            } else {
                System.out.println("O maior número é " + n2);
            }
        }

}
