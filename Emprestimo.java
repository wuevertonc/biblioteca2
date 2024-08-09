package biblioteca;

import java.time.LocalDate;

public class Emprestimo {

    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaevolucao;
    private LocalDate dataEntregaReal;
    private int situacao;
    private Usuario usuario;
    private Livro livro;

    public Emprestimo() {
    }

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataPrevistaevolucao, LocalDate dataEntregaReal, int situacao, Usuario usuario, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevistaevolucao = dataPrevistaevolucao;
        this.dataEntregaReal = dataEntregaReal;
        this.situacao = situacao;
        this.usuario = usuario;
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataPrevistaevolucao() {
        return dataPrevistaevolucao;
    }

    public void setDataPrevistaevolucao(LocalDate dataPrevistaevolucao) {
        this.dataPrevistaevolucao = dataPrevistaevolucao;
    }

    public LocalDate getDataEntregaReal() {
        return dataEntregaReal;
    }

    public void setDataEntregaReal(LocalDate dataEntregaReal) {
        this.dataEntregaReal = dataEntregaReal;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Emprestimo{");
        sb.append("dataEmprestimo=").append(dataEmprestimo);
        sb.append(", dataPrevistaevolucao=").append(dataPrevistaevolucao);
        sb.append(", dataEntregaReal=").append(dataEntregaReal);
        sb.append(", situacao=").append(situacao);
        sb.append(", usuario=").append(usuario);
        sb.append(", livro=").append(livro);
        sb.append('}');
        return sb.toString();
    }
    
}

