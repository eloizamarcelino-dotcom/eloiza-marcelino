import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inira a palvra");
        String palavra = sc.next();
        System.out.println(obterCaracter(palavra));

    }
    public static char obterCaracter(String palavra){
        if(palavra.length() %2 ==0){
            return palavra.charAt(0);
        }
        return palavra.charAt(1);
    }
}
