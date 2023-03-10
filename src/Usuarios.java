public class Usuarios {
    private String nome;
    private String idade;
    private String sexo;
    private String telefone;

    public Usuarios(String nome, String idade, String sexo, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public Usuarios(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void lerLivro(){
        System.out.println("USUARIO ESTÁ LENDO O LIVRO");
    }
}
