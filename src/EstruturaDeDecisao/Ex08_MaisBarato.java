package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex08_MaisBarato {

    //Faça um programa que pergunte o preço de três produtos e
    // informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        Double menorValor = 0.0;

        while (contador < 3 ){
            System.out.print("Digite o valor do produto: R$");
            Double valor = scanner.nextDouble();

            contador++;

            if (contador == 1){
                menorValor = valor;
            } else if (valor < menorValor){
                menorValor = valor;
            }
        }
        System.out.println("O produto que você deve comprar é o de valor R$" + menorValor);
    }

}
