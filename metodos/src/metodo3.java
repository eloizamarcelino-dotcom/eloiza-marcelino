import java.util.Scanner;

public class metodo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira um numero: ");
        int numero = sc.nextInt();

        imprimir20numeros(numero);
    }
    public static void imprimir20numeros(int num){
        for (int i = num ; i< num + 20 ; i++){
            System.out.println(i);
        }

    }

}
