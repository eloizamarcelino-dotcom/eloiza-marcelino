public class conta {
    private String nomeTitular;
    private double saldo;

    public void Conta(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;

    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getsaldo() {
        return saldo;
    }

    public void setsaldo(double saldo) {
        this.saldo = this.saldo;
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("saque realizado!");
        } else {
            System.out.println("saque nao efetuado por fata de saldo!");
        }
    }
        public void depositar (double valor){
           if(valor>0){
               saldo=+valor;
               System.out.println("deposito realizado");
           }else{
               System.out.println("Saldo insuficiente!");
           }

        }
        public void transferir(conta contaDestino, double valor) {
            if (valor > 0 && saldo >= valor) {
                saldo -= valor;
                contaDestino.depositar(valor);
                System.out.println("transferenciarealizado com sucaesso");
            } else {
                System.out.println("saldo insuficiente");
            }
        }
        public double simularInvestiento(double valor , int meses){
        double taxa =  0.01;
        double montante = valor * Math.pow(1 + taxa, meses);
        return montante;

        }
    }
