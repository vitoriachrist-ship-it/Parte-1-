public class Aluno extends Usuario 
{
    // Atributos específicos do aluno
    private double notaGA;
    private double notaGB;

    // Construtor repassando parâmetros para o construtor da superclasse
    public Aluno(int mat, String nom, String log, String sen) {
        super(mat, nom, log, sen);
    }

    public double getNotaGA() {
        return notaGA;
    }

    public void setNotaGA(double not) {
        this.notaGA = not;
    }

    public double getNotaGB() {
        return notaGB;
    }

    public void setNotaGB(double not) {
        this.notaGB = not;
    }
}