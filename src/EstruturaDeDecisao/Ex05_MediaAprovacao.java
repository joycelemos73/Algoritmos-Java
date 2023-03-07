package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex05_MediaAprovacao {

    //Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        Double primeiraNota = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        Double segundaNota = scanner.nextDouble();

        Double media = (primeiraNota + segundaNota) / 2;
        System.out.println("Média: " + media);

        if (media == 10){
            System.out.println("Aprovado com Distinção");
        } else if (media < 7) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }

}
