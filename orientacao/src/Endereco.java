public class Endereco {
    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private int numero;

    // Construtor
    public Endereco(String uf, String cidade, String cep, String logradouro, int numero) {
        this.uf = uf;
        this.cidade = cidade;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
    }
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Método para exibir o endereço
    public void exibirEndereco() {
        System.out.println("UF: " + uf);
        System.out.println("Cidade: " + cidade);
        System.out.println("CEP: " + cep);
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Número: " + numero);
    }
}
