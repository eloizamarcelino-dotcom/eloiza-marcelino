import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Qual a pessoa que você deseja ver as informações ? ");
        String nome = sc.next();


        if (nome.equalsIgnoreCase("Elo")) { //ignora caixa alta ou minuscula entra todas as vezes
            imprimirelo();
        } else if (nome.equalsIgnoreCase("pohl")) {
            imprimirpohl();
        } else if (nome.equalsIgnoreCase("matheus")) {
            imprimirmatheus();
        }

    }
    public static void imprimirelo() {
                System.out.println(" Nome Elo ");
            System.out.println("17 anos");
            System.out.println("Ele é estudante de desenvolvimento de sistemas\n");
            }
        public static void imprimirpohl() {
            System.out.println(" Nome Pohl ");
            System.out.println("19 anos");
            System.out.println("Ele é estudante de desenvolvimento de sistemas\n");
        }
        public static void imprimirmatheus() {
            System.out.println(" Nome matheus ");
            System.out.println("18 anos");
            System.out.println("Ele é estudante de desenvolvimento de sistemas\n");
        }

    }



