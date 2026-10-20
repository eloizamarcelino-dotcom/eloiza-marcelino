public class EmailJaCadastradoException extends Exception {

    public EmailJaCadastradoException(String email) {
        super("Já existe um aluno cadastrado com o e-mail: " + email);
    }
}
