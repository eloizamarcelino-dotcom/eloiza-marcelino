import java.util.ArrayList;
import java.util.List;

public class SistemaAlunos {

    private List<Aluno> alunos = new ArrayList<>();

    // DESAFIO: só cadastra se o e-mail ainda não existir
    public void cadastrarAluno(Aluno novoAluno) throws EmailJaCadastradoException {
        for (Aluno aluno : alunos) {
            if (aluno.getEmail().equalsIgnoreCase(novoAluno.getEmail())) {
                throw new EmailJaCadastradoException(novoAluno.getEmail());
            }
        }
        alunos.add(novoAluno);
    }

    // Retorna os alunos de um curso com idade >= idadeMinima e média >= mediaMinima
    public List<Aluno> buscarPorCurso(String curso, int idadeMinima, double mediaMinima) {
        List<Aluno> resultado = new ArrayList<>();

        for (Aluno aluno : alunos) {
            if (aluno.getCurso().equalsIgnoreCase(curso)
                    && aluno.getIdade() >= idadeMinima
                    && aluno.getMediaFinal() >= mediaMinima) {
                resultado.add(aluno);
            }
        }
        return resultado;
    }

    // Busca um aluno pela matrícula (única). Retorna null se não encontrar.
    public Aluno buscarPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }
}