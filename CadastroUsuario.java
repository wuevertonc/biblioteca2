package biblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class CadastroUsuario {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static int qtdUsuarios;

    public static void cadastrar() {
        Usuario user = new Usuario();
        setarInformacoes(user);
        usuarios.add(user);
        qtdUsuarios++;
    }

    public static void editar() {
        Usuario user = pesquisar();
        if (user != null) {
            setarInformacoes(user);
        }
    }

    public static void setarInformacoes(Usuario user) {
        System.out.println("Informe o nome: ");
        user.setNome(input.useDelimiter("\n").next());
        System.out.println("Informe o CPF: ");
        user.setCpf(input.next());
        System.out.println("Informe o telefone: ");
        user.setTelefone(input.next());
        System.out.println("Informe o matricula: ");
        user.setMatricula(input.next());
    }

    public static Usuario pesquisar() {
        System.out.println("informe a matricula");
        String matricula = input.next();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getMatricula().equals(matricula)) {
                Usuario user = usuarios.get(i);
                System.out.println("\n usuário encontrado!\n");
                System.out.println(user);
                return user;
            }
        }
        System.out.println("\n usuário não encontrado!\n");
        return null;
    }
    
    public static void listar(){
        if(usuarios.isEmpty()){
            System.out.println("Nenhum usuario cadastrado no sistema!");
            return;
        }
        
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario user = usuarios.get(i);
            
        }
    }
}
