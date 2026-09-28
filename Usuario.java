public class Usuario {
    // Atributos comuns para todos os usuários
    private int matricula;
    private String nome;
    private String login;
    private String senha;

    // Construtor
    public Usuario(int mat, String nom, String log, String sen) {
        this.matricula = mat;
        this.nome = nom;
        this.login = log;
        this.senha = sen;
    }

    // Métodos de acesso e configuração
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int mat) {
        this.matricula = mat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nom) {
        this.nome = nom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String log) {
        this.login = log;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String sen) {
        this.senha = sen;
    }
    
    public void exibeDados() {
        System.out.println("");
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Login: " + login);
    }
}