package biblioteca;

import biblioteca.Livro;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroLivro {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Livro> livros = new ArrayList<>();
    private static int qtdLivros;

    public static void cadastrar() {
        Livro livro = new Livro();
        setarInformacoes(livro);
        livros.add(livro);
        qtdLivros++;
    }

    public static Livro pesquisar() {
        System.out.println("Informe o código do livro: ");
        int codigo = input.nextInt();
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getCodigo() == codigo) {
                Livro livro = livros.get(i);
                System.out.println("\nLivro encontrado:\n" + livro);
                return livro;
            }
        }
        System.out.println("\nLivro não encontrado!\n");
        return null;
    }

    public static void editar() {
        Livro livro = pesquisar();
        if (livro != null) {
            setarInformacoes(livro);
        }
    }

    public static void remover() {
        Livro livro = pesquisar();
        if (livro != null) {
            livros.remove(livro);
            System.out.println("Livro removido com sucesso!");
        }
    }

    public static void setarInformacoes(Livro livro) {
        System.out.println("Informe o código: ");
        livro.setCodigo(input.nextInt());
        System.out.println("Informe o ano: ");
        livro.setAno(input.nextInt());
        System.out.println("Informe a edição: ");
        livro.setEdicao(input.nextInt());
        input.nextLine();
        System.out.println("Informe o título: ");
        livro.setTitulo(input.nextLine());
        System.out.println("Informe o autor: ");
        livro.setAutor(input.nextLine());
        System.out.println("Informe a editora: ");
        livro.setEditora(input.nextLine());
        System.out.println("O livro está emprestado? (true/false): ");
        livro.setEmprestado(input.nextBoolean());
    }

    public static void listar() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado no sistema!");
            return;
        }

        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
