package biblioteca;


public class Livro {
    private int codigo;
    private int ano;
    private int edicao;
    private String titulo;
    private String autor;
    private String editora;
    private boolean emprestado;

public Livro(){
    
}

    public Livro(int codigo, int ano, int edicao, String titulo, String autor, String editora, boolean emprestado) {
        this.codigo = codigo;
        this.ano = ano;
        this.edicao = edicao;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.emprestado = emprestado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Livro{");
        sb.append("codigo=").append(codigo);
        sb.append(", ano=").append(ano);
        sb.append(", edicao=").append(edicao);
        sb.append(", titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", editora=").append(editora);
        sb.append(", emprestado=").append(emprestado);
        sb.append('}');
        return sb.toString();
    }

}

