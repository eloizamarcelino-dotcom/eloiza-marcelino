public class Produto {

    // ATRIBUTOS (as "características" do produto)
    private String marca;
    private String modelo;
    private double preco;
    private int qtdEstoque;

    // CONSTRUTOR: serve para criar um produto já com os dados preenchidos
    public Produto(String marca, String modelo, double preco, int qtdEstoque) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    // GETTERS E SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    // MÉTODO 1: adicionar mais unidades ao estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida! Digite um valor maior que zero.");
            return; // para o método aqui
        }
        qtdEstoque = qtdEstoque + quantidade;
    }

    // MÉTODO 2: vender (só pode vender até a quantidade que tem no estoque)
    // Retorna true se a venda deu certo e false se não deu
    public boolean vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida! Digite um valor maior que zero.");
            return false;
        }
        if (quantidade > qtdEstoque) {
            System.out.println("Estoque insuficiente! Você tem apenas " + qtdEstoque
                    + " unidade(s) de " + modelo + ".");
            return false;
        }
        qtdEstoque = qtdEstoque - quantidade;
        return true;
    }

    // Faz o produto aparecer bonitinho quando você imprime ele
    @Override
    public String toString() {
        return marca + " - " + modelo
                + " | R$ " + String.format("%.2f", preco)
                + " | Estoque: " + qtdEstoque;
    }
}