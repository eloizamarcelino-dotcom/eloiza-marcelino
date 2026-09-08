public class eX3 {
    public static void main(String[] args) {
        produtos produto1 = new produtos();
        produtos produto2 = new produtos();
        produtos produto3 = new produtos();

        produto1.nome = "Caneta esf";
        produto1.descricao = "Caneta esferográfica 5cm";
        produto1.precoU = 1.2;
        produto1.desconto = 2;

        produto2.desconto = 3;
        produto2.precoU= 2.4;
        produto2.descricao = "Caderno de 1 materia";
        produto2.nome = "Caderno";

        produto3.nome = "Demaquilante rosa";
        produto3.precoU = 15;
        produto3.desconto = 2;
        produto3.descricao = "Tira maquiagem noturno";
    }
}
