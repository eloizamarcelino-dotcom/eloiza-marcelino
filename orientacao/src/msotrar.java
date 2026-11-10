public class msotrar {

    public static void main(String[] args) {

        // Criando um objeto Endereco
        Endereco endereco1 = new Endereco(
                "SC",
                "Blumenau",
                "89010-000",
                "Rua XV de Novembro",
                100
        );

        // Criando um objeto Pessoa
        Pessoa pessoa1 = new Pessoa("João", endereco1);

        // Exibindo os dados
        pessoa1.exibirPessoa();

        // Alterando o nome usando o Setter
        pessoa1.setNome("Pedro");

        // Exibindo o nome atualizado usando o Getter
        System.out.println("\nNome atualizado: " + pessoa1.getNome());
    }
}