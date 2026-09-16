public class Aeronave {

    private String modelo;
    private int Passageiro ;
    private double velocidadeMax;
    private double capcombustivel;
    private double queimaPorMin;

      //Construtor completo para inicializar todos os atributos da aeronave.

     //param modelo         O modelo da aeronave.
      //param qtdPassageiros A quantidade de passageiros suportada.
     //param velMax         A velocidade máxima da aeronave.
     //param capCombustivel A capacidade total de combustível.
    // param queimaMinuto   O consumo de combustível por minuto.

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            System.out.println("invalidinho");
        } else {

            this.modelo = modelo;
        }
    }

    public int getPassageiro() {
        return Passageiro;
    }

    public void setPassageiro(int passageiro) {
        Passageiro = passageiro;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        if(velocidadeMax <=0){
            System.out.println("Invalido");
        }else {
            this.velocidadeMax = velocidadeMax;
        }
    }

    public double getCapcombustivel() {
        return capcombustivel;
    }

    public void setCapcombustivel(double capcombustivel) {
        if (capcombustivel <= 0) {
            System.out.println("invalido");
        } else {
            this.capcombustivel = capcombustivel;
        }
    }

    public double getQueimaPorMin() {
        return queimaPorMin;
    }

    public void setQueimaPorMin(double queimaPorMin) {
        this.queimaPorMin = queimaPorMin;
    }

    public Aeronave(String modelo, int qtdPassageiros, double velMax, double capCombustivel, double queimaMinuto) {
        /*this.modelo = modelo;
        this.Passageiro  = qtdPassageiros;
        this.velocidadeMax = velMax;
        this.capcombustivel = capCombustivel;
        this.queimaPorMin = queimaMinuto;
         SUBSTITUIDA POR SET E GET --- ALT+INSERT*/
    setModelo(modelo);
    setCapcombustivel(capCombustivel);
    setPassageiro(qtdPassageiros);
    setQueimaPorMin(queimaMinuto);
    setVelocidadeMax(velMax);
    }



      //Calcula a autonomia da aeronave em minutos de voo. O cálculo é baseado na
    //capacidade total do tanque dividida pelo consumo por minuto.
     //return O tempo total de autonomia em minutos.

    public double calcularAutonomia() {
        return capcombustivel / queimaPorMin;
    }

   //   Calcula a distância máxima que a aeronave consegue percorrer. O cálculo
//      utiliza o tempo de autonomia multiplicado pela velocidade máxima.

    //  return A distância máxima alcançável (geralmente em quilômetros).

    public double calcularDistanciaMaxima() {
        return calcularAutonomia() * velocidadeMax;
    }
     //Retorna uma representação em texto com todos os dados da aeronave.

    // return Uma string contendo os valores de todos os atributos da classe.

    public String toString() {
        return "Aeronave [modelo=" + modelo + ", qtdPassageiros=" + Passageiro  + ", velMax=" + velocidadeMax
                + ", capCombustivel=" + capcombustivel + ", queimaMinuto=" + queimaPorMin + "]";
    }

}