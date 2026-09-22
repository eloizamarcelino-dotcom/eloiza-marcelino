public class exer8 {
    public static void main(String[] args) {
        contribuinte c1 = new contribuinte("João", "00000000000", "SC", 2800);
        contribuinte c2 = new contribuinte("Maria", "11111111111", "PR", 5000);
        contribuinte c3 = new contribuinte("Ana", "22222222222", "RS", 10000);
        contribuinte c4 = new contribuinte("Carlos", "33333333333", "PR", 27000);
        contribuinte c5 = new contribuinte("Jorge", "44444444444", "SC", 38000);


        contribuinte[] contribuintes = { c1, c2, c3, c4, c5 };

        // Quem mais paga imposto
        double maiorImposto = 0;
        contribuinte contribuinteMaiorImposto = null;

        for (int i = 0; i < contribuintes.length; i++) {
            if (contribuintes[i].calcularImposto() > maiorImposto) {
                maiorImposto = contribuintes[i].calcularImposto();
                contribuinteMaiorImposto = contribuintes[i];
            }
        }
        System.out.println(contribuinteMaiorImposto);

        // Qual o total de imposto pago entre os 5 contribuintes
        double totalImposto = 0;
        for (int i = 0; i < contribuintes.length; i++) {
            totalImposto += contribuintes[i].calcularImposto();
        }
        System.out.println("O total de imposto pago é de R$" + totalImposto);

    }
    }

