import java.time.LocalDate;
import java.time.LocalTime;

public class Emprestimos {
    private LocalDate dataDoEmprestimo;
    private LocalTime horaDoEmprestimos;
    private Livros livro;
    private Usuarios usuario;

    public Emprestimos(Livros livro, Usuarios usuario) {
        this.dataDoEmprestimo = LocalDate.now();
        this.horaDoEmprestimos = LocalTime.now();
        this.livro = livro;
        this.usuario = usuario;
        this.livro.setEmprestimo(true);
    }


    public LocalDate getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(LocalDate dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public LocalTime getHoraDoEmprestimos() {
        return horaDoEmprestimos;
    }

    public void setHoraDoEmprestimos(LocalTime horaDoEmprestimos) {
        this.horaDoEmprestimos = horaDoEmprestimos;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public void devolverLivro(){
        livro.setEmprestimo(false);
        System.out.println("LIVRO DEVOLVIDO");
    }

}
