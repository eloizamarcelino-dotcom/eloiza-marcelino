import java.util.List;

public class Mani {

    public static void main(String[] args) {
        SistemaAlunos sistema = new SistemaAlunos();

        // Cadastro de alunos
        cadastrar(sistema, new Aluno("Ana Souza", 20, "2024001", "Desenvolvimento de Sistemas", 8.5, "ana@email.com"));
        cadastrar(sistema, new Aluno("Bruno Lima", 22, "2024002", "Desenvolvimento de Sistemas", 6.0, "bruno@email.com"));
        cadastrar(sistema, new Aluno("Carla Dias", 19, "2024003", "Desenvolvimento de Sistemas", 9.2, "carla@email.com"));
        cadastrar(sistema, new Aluno("Diego Rocha", 25, "2024004", "Engenharia", 7.5, "diego@email.com"));

        // Teste do desafio: e-mail repetido deve lançar exceção
        cadastrar(sistema, new Aluno("Eduardo Reis", 21, "2024005", "Desenvolvimento de Sistemas", 7.0, "ana@email.com"));

        // Teste 1: alunos de um curso com idade >= 19 e média >= 7.0
        System.out.println("\n--- Alunos de Desenvolvimento de Sistemas (idade >= 19 e média >= 7.0) ---");
        List<Aluno> filtrados = sistema.buscarPorCurso("Desenvolvimento de Sistemas", 19, 7.0);
        for (Aluno aluno : filtrados) {
            System.out.println(aluno);
        }

        // Teste 2: busca por matrícula
        System.out.println("\n--- Busca por matrícula ---");
        Aluno encontrado = sistema.buscarPorMatricula("2024004");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado);
        } else {
            System.out.println("Aluno não encontrado.");
        }

        Aluno naoEncontrado = sistema.buscarPorMatricula("9999999");
        if (naoEncontrado == null) {
            System.out.println("Matrícula 9999999: aluno não encontrado.");
        }
    }

    // Método auxiliar para não repetir try/catch a cada cadastro
    private static void cadastrar(SistemaAlunos sistema, Aluno aluno) {
        try {
            sistema.cadastrarAluno(aluno);
            System.out.println("Aluno cadastrado: " + aluno.getNome());
        } catch (EmailJaCadastradoException e) {
            System.out.println("Erro ao cadastrar " + aluno.getNome() + ": " + e.getMessage());
        }
    }
}