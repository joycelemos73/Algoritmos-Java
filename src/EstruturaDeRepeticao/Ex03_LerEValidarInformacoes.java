package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex03_LerEValidarInformacoes {

//Faça um programa que leia e valide as seguintes informações:
//Nome: maior que 3 caracteres;
//Idade: entre 0 e 150;
//Salário: maior que zero;
//Sexo: 'f' ou 'm';
//Estado Civil: 's', 'c', 'v', 'd';

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        while (nome.split("").length < 3){
            System.out.println("Erro! Entre um nome com mais de 3 letras.");
            System.out.print("Nome: ");
            nome = scanner.nextLine();
        }

        System.out.print("Idade: ");
        Integer idade = scanner.nextInt();
        while (idade < 0 || idade > 150){
            System.out.println("Erro! Entre uma idade válida.");
            System.out.print("Idade: ");
            idade = scanner.nextInt();
        }

        System.out.print("Salário: ");
        Double salario = scanner.nextDouble();
        while (salario < 0){
            System.out.println("Erro! Entre um salário válido.");
            System.out.print("Salário: ");
            salario = scanner.nextDouble();
        }

        System.out.print("Sexo [M/F]: ");
        String sexo = scanner.next().toUpperCase();
        while (sexo.charAt(0) != 'M' && sexo.charAt(0) != 'F'){
            System.out.println("Erro! Entre um sexo válido.");
            System.out.print("Sexo [M/F]: ");
            sexo = scanner.next().toUpperCase();
        }


        System.out.print("Estado Civil: ");
        String estadoCivil = scanner.next().toUpperCase();
        while (estadoCivil.charAt(0) != 'S' && estadoCivil.charAt(0) != 'C' && estadoCivil.charAt(0) != 'V' && estadoCivil.charAt(0) != 'D'){
            System.out.println("Erro! Entre um estado civil válido.");
            System.out.print("Estado Civil: ");
            estadoCivil = scanner.next().toUpperCase();
        }

    }
}
