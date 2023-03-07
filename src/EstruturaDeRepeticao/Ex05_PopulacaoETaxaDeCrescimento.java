package EstruturaDeRepeticao;


////Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
//// Valide a entrada e permita repetir a operação.

import java.util.Scanner;

public class Ex05_PopulacaoETaxaDeCrescimento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String continuar = "S";
        int anosSuperarOuIgualar = 0;


        while (continuar.equals("S")) {

            System.out.print("Entre a POPULAÇÃO do menor país: ");
            int populacaoPais1 = scanner.nextInt();

            System.out.print("Entre a TAXA DE CRESCIMENTO do menor país: ");
            double taxaCrescimentoPais1 = scanner.nextDouble();

            System.out.print("Entre a POPULAÇÃO do maior país: ");
            int populacaoPais2 = scanner.nextInt();

            System.out.print("Entre a TAXA DE CRESCIMENTO do maior país: ");
            double taxaCrescimentoPais2 = scanner.nextDouble();


            while (populacaoPais1 < populacaoPais2){
                populacaoPais1 *= taxaCrescimentoPais1;
                System.out.println(populacaoPais1);
                populacaoPais2 *= taxaCrescimentoPais2;
                System.out.println(populacaoPais2);

                anosSuperarOuIgualar++;
                System.out.println(anosSuperarOuIgualar);
            }


            System.out.println("");
            System.out.println("Em " + anosSuperarOuIgualar + " anos, estas serão as populações dos países A e B:");
            System.out.println("País A: " + populacaoPais1 + " habitantes");
            System.out.println("País B: " + populacaoPais2 + " habitantes");

            System.out.println("");
            System.out.print("Deseja comparar outros países? [ X para sair] ");
            continuar = scanner.next();

        }

    }
}
