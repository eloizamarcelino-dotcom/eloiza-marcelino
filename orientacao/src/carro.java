public class carro {
    private double velocidade;

    public carro (double velocidade){
        setVelocidade(velocidade);
    }
    public void acelerar (double acelercao) {// valor da aceleracao
        if(acelercao <0 || acelercao>=20){
            throw new IllegalArgumentException("aceleração invalida!");
        }
        setVelocidade(velocidade + acelercao);
    }

    public double getVelocidade() {
        return velocidade ;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade <0){
            throw new IllegalArgumentException("velocidade nao pode ser negativa ");
        }
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "carro{" + "velocidade=" + velocidade + '}';
    }
}
