public class Main {
    public static void main(String[] args) {

        Livros livros = new Livros();
        Usuarios usuarios = new Usuarios();
        Emprestimos emprestimos = new Emprestimos(livros, usuarios);

        livros.setTitulo("AMOR");
        livros.setAno("20/10/2012");


        usuarios.setNome("MICHELLE");



        System.out.println("-----EMPRÉSTIMO-----");
        System.out.println("LIVRO: " + livros.getTitulo());
        System.out.println("NOME: " + usuarios.getNome());
        System.out.println("DATA: " + livros.getAno());




    }
}