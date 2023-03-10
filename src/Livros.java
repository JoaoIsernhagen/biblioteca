public class Livros {
    private String titulo;
    private String autores;
    private String editora;
    private String ano;
    private String edicao;
    private String numeroDeFolhas;

    private boolean emprestimo;

    public Livros(String titulo, String autores, String editora, String ano, String edicao, String numeroDeFolhas, boolean emprestimo) {
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numeroDeFolhas = numeroDeFolhas;
        this.emprestimo = false;
    }

    public Livros(){

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getNumeroDeFolhas() {
        return numeroDeFolhas;
    }

    public void setNumeroDeFolhas(String numeroDeFolhas) {
        this.numeroDeFolhas = numeroDeFolhas;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public void abrirLivro(){
        System.out.println("LIVRO ESTÁ ABERTO PARA LEITURA");
    }

    public void fecharLivro(){
        System.out.println("LIVRO ESTÁ FECHADO PARA LEITURA");
    }
}
