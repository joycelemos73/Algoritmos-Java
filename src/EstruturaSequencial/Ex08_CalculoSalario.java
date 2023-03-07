package EstruturaSequencial;

//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class Ex08_CalculoSalario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? R$");
        Double valorHora = scanner.nextDouble();

        System.out.print("Quantas horas você trabalhou no último mês? ");
        Integer horasTrabalhadas = scanner.nextInt();

        Double salario = valorHora * horasTrabalhadas;

        System.out.println("O seu salário este mês será de " + salario);

    }
}
