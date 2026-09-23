import java.util.InputMismatchException;
import java.util.Scanner;

public class exercaoTESTE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[4];

        try {
            int valor = sc.nextInt();
            vetor[4] = valor;

        } catch (InputMismatchException e) {
            System.out.println("invalido");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("saiu");
        }
    }
}
