import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero par ou impar :");
        int numero = sc.nextInt();

        System.out.println(determinarParouImpar(numero));
    }
    public static boolean determinarParouImpar (int numero){
        if (numero % 2 == 0 ) {
            return true;
            
        }else { // não é obrigatorio
            return false;
        }
    }

}
