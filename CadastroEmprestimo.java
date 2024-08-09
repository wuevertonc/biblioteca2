package biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;



public class CadastroEmprestimo {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    
    public static void realizarEmprestimo() {
        Emprestimo emp = new Emprestimo();
        setarInformacoes(emp);
        emprestimos.add(emp);
    }

    public static void realizarDevolucao() {
        Emprestimo emp = pesquisar();
        if (emp == null) {
            return;
        }

        System.out.println("Informe a data de devolucao");
        String dataDev = input.next();
        emp.setDataEntregaReal(LocalDate.parse(dataDev, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        emp.setSituacao(0);
    }

    public static Emprestimo pesquisar() {
        Usuario user = CadastroUsuario.pesquisar();
        if (user == null) {
            return null;
        }
        Livro liv = CadastroLivro.pesquisar();
        if (liv == null) {
            return null;
        }
        for (int i = 0; i < emprestimos.size(); i++) {
            Emprestimo e = emprestimos.get(i);
            if (e.getUsuario().getMatricula().equals(user.getMatricula())
                    && e.getLivro().getCodigo() == liv.getCodigo()) {
                return e;
            }
        }

        System.out.println("Emprestimo nao foi encontrado!");
        return null;
    }


   

    public static void setarInformacoes(Emprestimo emp) {
        Usuario user = CadastroUsuario.pesquisar();
        if (user == null) {
            return;
        }
        Livro liv = CadastroLivro.pesquisar();
        if (liv == null) {
            return;
        }

        emp.setUsuario(user);
        emp.setLivro(liv);

        LocalDate dateEmp = LocalDate.now();
        LocalDate dataPrevDev = dateEmp.plusDays(7);

        emp.setDataEmprestimo(dateEmp);
        emp.setDataEmprestimo(dataPrevDev);
        emp.setSituacao(1);
        //LocalDate.parse("", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}
