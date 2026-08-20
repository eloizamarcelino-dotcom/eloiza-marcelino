import java.util.Scanner;

public class exrecicio7 {
    public static void main(String[] args) {
        //Faça um programa em que o usuário entre com um número de 1 a 4
        //Com o número 1 sendo verão, 2 sendo outono...
        //Dependendo de o que o usuário informa, retorne:
        //É verão
        //E o tempo está quente.
        //      Ou
        //É inverno
        //E está frio.
        Scanner input = new Scanner(System.in);

        System.out.println("Qua a estação do ano? ");
        int estacao = input.nextInt();

        if (estacao == 1) {
            verao();
        } else if (estacao == 2) {
            outono();

        } else if (estacao == 3) {
            primavera();
        } else if (estacao == 4) {
            inverno();
        }
    }
    public static String verao()  {
        return "É verõ e o tmepo está quente ";
    }
    public static String outono() {
        return "As folhas estão laranjas!";
    }
    public static String primavera() {
        return "Está florindo a veetação!";
    }
    public static String inverno() {
        return "Está muito frio!";
    }

}
