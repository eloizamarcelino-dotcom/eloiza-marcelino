import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) { // para sair precisa ser declarado no metodo main
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite sua nota: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite sua nota: ");
        double n3 = sc.nextDouble();

        System.out.println(media(n1,n2,n3)); //para mostrar precisa ser chamado fora do metodo
    }
        public static double media(double n3 , double n2, double n1 ){
        if(n2<0 || n2>10|| n1<0 || n1>10|| n3<0 || n3>10){
            return  0;
        }
        double soma = n3 + n2 + n1;
        double total = soma / 3;


            return total;

        }



}
