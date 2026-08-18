import java.util.Scanner;

public class metodocomparametro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        desempenharCalculo(5,4,2);
    }
     public static void desempenharCalculo(int n1,int n2, int n3){
        int result = (n1+n2)*n3;
        System.out.println(result);
    }
}
