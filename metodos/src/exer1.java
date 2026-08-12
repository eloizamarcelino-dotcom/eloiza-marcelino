import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qua a estação do ano? ");
        int estacao = input.nextInt();

        if(estacao == 1) {
            verao();
        }else if(estacao==2){
                outono();

            }else if(estacao==3){
                primavera();
            }else if(estacao==4){
                inverno();
            }
        }
        public static void verao() {
            System.out.println(" O clima esta quente e abafado!");
        }
        public static void outono() {
            System.out.println("As folhas estão laranjas!");
        }
        public static void primavera() {
            System.out.println("Está florindo a veetação!");
        }
        public static void inverno() {
            System.out.println("Está muito frio!");
        }
    }

