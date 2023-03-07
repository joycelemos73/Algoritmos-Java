package EstruturaDeRepeticao;

import java.util.Scanner;

//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações

public class Ex02_NomeESenha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        while (usuario.equals(senha)) {
            System.out.println("*************** ERRO **************");
            System.out.println("Senha não pode ser igual ao Usuário");
            System.out.println("********* TENTE NOVAMENTE *********");
            System.out.println("");

            System.out.print("Usuário: ");
            usuario = scanner.nextLine();

            System.out.print("Senha: ");
            senha = scanner.nextLine();
        }

    }
}
