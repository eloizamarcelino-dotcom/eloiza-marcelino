import java.time.LocalDate;

public class validacaoidade {
    public static void main(String[] args) {
        LocalDate nascimento = LocalDate.of(2010, 5, 20);
        System.out.println(nascimento.plusYears(18).isAfter(LocalDate.now()) ? "Menor de idade" : "Maior de idade");
    }
}