import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstaNaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numero = new ArrayList<>();
        numero.add(1);
        numero.add(8);
        numero.add(4);
        numero.add(2);
        System.out.println("Digit o seu numero desejado");
        int numer = sc.nextInt();
        int indice = numero.indexOf(numer);


        if (indice !=  -1) {
            System.out.println(indice);
        } else {
            System.out.println("Não está presente ");
        }
    }
}

