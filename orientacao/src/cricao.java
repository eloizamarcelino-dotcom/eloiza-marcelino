public class cricao {
    public static void main(String[] args) {
        conta c1 = new conta("joao ", 1000);
        conta c2 = new conta("matheus", 500);

        c1.depositar(300);

        c1.depositar(300);

        c1.transferir(c2,100);

        double resultado = c1.simularInvestiento(100+12);

        System.out.println("valor do investmento : " + resultado);

        System.out.println("titular: "+ c1.getNomeTitular());
        System.out.println("saldo de joao : "+ c1.getsaldo());

        System.out.println("titular " + c2.getsaldo());
        System.out.println("saldide maria : "+ c2.getsaldo());
    }
}
