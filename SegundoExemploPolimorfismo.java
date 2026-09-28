public class SegundoExemploPolimorfismo {
    public static void main(String[] args) {
        // Criar usuário comum
        Usuario usuario = new Usuario(
            Teclado.leInt("Informe a matricula do usuario: "),
            Teclado.leString("Informe o nome do usuario: "),
            Teclado.leString("Informe o login do usuario: "),
            Teclado.leString("Informe a senha do usuario: ")
        );

        // Criar professor
        Professor professor = new Professor(
            Teclado.leInt("Informe a matricula do professor: "),
            Teclado.leString("Informe o nome do professor: "),
            Teclado.leString("Informe o login do professor: "),
            Teclado.leString("Informe a senha do professor: ")
        );
        professor.setAreaAtuacao(Teclado.leString("Informe a área de atuação do professor: "));

        // Criar aluno
        Aluno aluno = new Aluno(
            Teclado.leInt("Informe a matricula do aluno: "),
            Teclado.leString("Informe o nome do aluno: "),
            Teclado.leString("Informe o login do aluno: "),
            Teclado.leString("Informe a senha do aluno: ")
        );

        // Apresentar os dados chamando o método polimórfico
        usuario.exibeDados();
        professor.exibeDados();
        aluno.exibeDados();
    }
}