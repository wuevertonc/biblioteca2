package biblioteca;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int op = -1;

        while (op != 0) {
            System.out.println("digite 1 para cadastrar usuário");
            System.out.println("digite 2 para editar usuário");
            System.out.println("digite 3 para pesquisar usuário");
            System.out.println("digite 0 para sair!");

            op = input.nextInt();

            switch (op) {
                case 0:
                    return;
                case 1:
                    CadastroUsuario.cadastrar();
                    break;
                case 2:
                    CadastroUsuario.editar();
                    break;
                case 3:
                    CadastroUsuario.pesquisar();
                    break;
                default:
                    System.out.println("valor inválido!");
            }
        }
    }

}
