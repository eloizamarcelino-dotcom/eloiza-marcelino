public class aparece_carro {
    public static void main(String[] args) {
        carro c1 = new carro(50); //void nao é metodo de retorno

        System.out.println(c1.getVelocidade());

        c1.acelerar(5);

        System.out.println(c1.getVelocidade());
    }
}
