import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1) Cria a loja
        MateriaisDeConstrucao loja = new MateriaisDeConstrucao();

        // 2) Cria alguns produtos e coloca na loja
        Produto p1 = new Produto("Tigre", "Cano PVC 25mm", 15.90, 50);
        Produto p2 = new Produto("Tigre", "Joelho 90 graus", 4.50, 100);
        Produto p3 = new Produto("Tigre", "Caixa d'água 500L", 380.00, 8);
        Produto p4 = new Produto("Votoran", "Tinta Branca 18L", 290.00, 12);
 
        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);
        loja.adicionarProduto(p4);

        // 3) Testando adicionar estoque
        System.out.println("=== Adicionando estoque ===");
        System.out.println("Antes: " + p1);
        p1.adicionarEstoque(20);
        System.out.println("Depois: " + p1);

        // 4) Testando vender
        System.out.println("\n=== Vendendo ===");
        boolean vendeu = p3.vender(3);
        System.out.println("Vendeu 3? " + vendeu + " -> " + p3);

        vendeu = p3.vender(10); // só tem 5 agora, então vai falhar
        System.out.println("Vendeu 10? " + vendeu + " -> " + p3);

        // 5) Produto mais caro de uma marca
        System.out.println("\n=== Mais caro da Tigre ===");
        Produto maisCaro = loja.getProdutoMaisCaroDaMarca("Tigre");
        if (maisCaro != null) {
            System.out.println(maisCaro);
        } else {
            System.out.println("Nenhum produto dessa marca.");
        }

        // 6) Produtos de uma marca entre dois preços
        System.out.println("\n=== Tigre entre R$ 5,00 e R$ 100,00 ===");
        List<Produto> filtrados = loja.getProdutosPorMarcaEFaixaDePreco("Tigre", 5.0, 100.0);
        if (filtrados.isEmpty()) {
            System.out.println("Nenhum produto encontrado nessa faixa.");
        } else {
            for (Produto p : filtrados) {
                System.out.println(p);
            }
        }
    }
}