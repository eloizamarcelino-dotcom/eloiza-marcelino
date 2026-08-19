import java.util.Scanner;

public class exemplo1 {

    public static double somarNumero (int num1, int num2){
        double soma = num1 + num2;
        return soma;
        // poderia ser return num1 + num 2 ;


    }
    public static void main(String[] args){
        double soma =  somarNumero(10,2);

        System.out.println(soma);

        System.out.println(somarNumero(5,4));
    }
}

