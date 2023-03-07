package EstruturaSequencial;

//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class Ex07_AreaQuadrado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor dos lados do quadrado: ");
        Double valorLadoQuadrado = scanner.nextDouble();

        Double areaQuadrado = Math.pow(valorLadoQuadrado, 2);

        Double dobroAreaQuadrado = 2 * areaQuadrado;

        System.out.println("Um quadrado com lado " + valorLadoQuadrado + " tem uma área com valor " + areaQuadrado + ". ");
        System.out.println("O dobro dessa área tem valor " + dobroAreaQuadrado);

    }
}
