public class ClassePrincipalADDVeiculo {
    public static void main(String[] args) {

        VeiculosARAY v1 = new VeiculosARAY("Honda", "Civic", "XXXX", 2010, 45000);
        VeiculosARAY v2 = new VeiculosARAY("Palio", "Weekend", "WSDFA", 1986, 40000);
        VeiculosARAY v3 = new VeiculosARAY("Prisma", "Maçã", "Wtf", 1991, 5000);
        VeiculosARAY v4 = new VeiculosARAY("Cronnos", "1.3", "kajdbgpi", 1986, 38000);
        VeiculosARAY v5 = new VeiculosARAY("Polo", "gti", "4w5rt", 1986, 32000);

        ConcessionarioARAY c1 = new ConcessionarioARAY();
        c1.adicionarVeiculo(v1);
        c1.adicionarVeiculo(v2);

        System.out.println(c1.obterVeiculoMaisBarato()); // ele vai procurar qual o veiculo mais barato
        ConcessionarioARAY c2 = new ConcessionarioARAY();
        c2.adicionarVeiculo(v3);
        c2.adicionarVeiculo(v4);
        c2.adicionarVeiculo(v5);
    }
}
