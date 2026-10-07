import java.util.ArrayList;
import java.util.List;

public class ConcessionarioARAY {
    private List<VeiculosARAY> veiculosARAYS; // lista de veiculos

    public ConcessionarioARAY() {
        veiculosARAYS = new ArrayList<VeiculosARAY>();// bao organizacao ter a instancia de objeto no construtor

    }

    public void adicionarVeiculo(VeiculosARAY v) {
        veiculosARAYS.add(v);
    }

    public VeiculosARAY obterVeiculoMaisBarato() {
        double menorPreco = Double.MAX_VALUE;
        VeiculosARAY veiculoMaisBarato = null;
        for (VeiculosARAY v : veiculosARAYS) {
            if (v.getPreco() < menorPreco) {
                menorPreco = v.getPreco();
                veiculoMaisBarato = v;

            }
        }
    return veiculoMaisBarato;
}

}

