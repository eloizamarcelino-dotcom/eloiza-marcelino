public class classePrincipal {
    public static void main(String[] args) {
        //uncia classe que deveria ser executavel

        veiculo v1 = new veiculo(); // se tornou em um objeto chamado v1
        v1.ano = 2019;
        v1.marca = "fiat";
        v1.modelo = "Cronos";
        v1.placa = "1234";
        v1.preco = 40000;

        System.out.println(v1.marca + " " + v1.modelo);

        veiculo v2 = new veiculo();
        v2.ano = 2020;
        v2.marca = "huyndai";
        v2.modelo = "naosei";
        v2.placa = "123456789";
        v2.preco = 10000;

        System.out.println(v2.ano + " " + v2.preco);
    }
}
