public class TerceiroExemploClasseAbstrata {
    public static void main(String[] args) {
        /* 
         * A linha abaixo causaria erro de compilação ("Usuario is abstract; cannot be instantiated"):
         * Usuario usuario = new Usuario(...);
         */

        // Instanciação permitida apenas para as subclasses especializadas
        Professor professor = new Professor(
            Teclado.leInt("Informe a matricula do professor: "),
            Teclado.leString("Informe o nome do professor: "),
            Teclado.leString("Informe o login do professor: "),
            Teclado.leString("Informe a senha do professor: ")
        );
        professor.setAreaAtuacao(Teclado.leString("Informe a área de atuação do professor: "));

        Aluno aluno = new Aluno(
            Teclado.leInt("Informe a matricula do aluno: "),
            Teclado.leString("Informe o nome do aluno: "),
            Teclado.leString("Informe o login do aluno: "),
            Teclado.leString("Informe a senha do aluno: ")
        );

        // Exibição dos dados dos objetos concretos
        professor.exibeDados();
        aluno.exibeDados();
    }
}