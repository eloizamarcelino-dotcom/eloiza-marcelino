public class Aluno {

    private String nome;
    private int idade;
    private String matricula;
    private String curso;
    private double mediaFinal;
    private String email;

    public Aluno(String nome, int idade, String matricula, String curso, double mediaFinal, String email) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
        this.mediaFinal = mediaFinal;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public String getEmail() {
        return email;
    }


    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matrícula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", média final=" + mediaFinal +
                ", e-mail='" + email + '\'' +
                '}';
    }
}