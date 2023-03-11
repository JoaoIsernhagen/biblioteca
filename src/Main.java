public class Main {
    public static void main(String[] args) {

        Livros livros = new Livros();
        livros.setTitulo("AMOR");
        livros.setAno("20/10/2012");

        Usuarios usuarios = new Usuarios();
        usuarios.setNome("MICHELLE");

        Emprestimos emprestimos = new Emprestimos(livros,usuarios);

        System.out.println("-----EMPRÉSTIMO-----");
        System.out.println("LIVRO: " + livros.getTitulo());
        System.out.println("NOME: " + usuarios.getNome());
        System.out.println("DATA: " + livros.getAno());

        livros.abrirLivro();

        usuarios.lerLivro();

        livros.fecharLivro();

        emprestimos.devolverLivro();


    }
}