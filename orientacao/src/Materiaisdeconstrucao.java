import java.util.ArrayList;
import java.util.List;

public class MateriaisDeConstrucao {

    // A loja guarda uma LISTA com todos os produtos
    private List<Produto> produtos = new ArrayList<>();

    // Método para cadastrar um produto na loja
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // MÉTODO 1: produto mais caro de uma determinada marca
    // Retorna null se a loja não tiver nenhum produto dessa marca
    public Produto getProdutoMaisCaroDaMarca(String marca) {
        Produto maisCaro = null;

        for (Produto p : produtos) {
            if (p.getMarca().equalsIgnoreCase(marca)) {
                // Se ainda não escolhi nenhum, ou se esse é mais caro que o escolhido
                if (maisCaro == null || p.getPreco() > maisCaro.getPreco()) {
                    maisCaro = p;
                }
            }
        }
        return maisCaro;
    }

    // MÉTODO 2: todos os produtos de uma marca com preço entre X e Y
    public List<Produto> getProdutosPorMarcaEFaixaDePreco(String marca, double precoMin, double precoMax) {
        List<Produto> resultado = new ArrayList<>();

        for (Produto p : produtos) {
            boolean mesmaMarca = p.getMarca().equalsIgnoreCase(marca);
            boolean dentroDaFaixa = p.getPreco() >= precoMin && p.getPreco() <= precoMax;

            if (mesmaMarca && dentroDaFaixa) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}