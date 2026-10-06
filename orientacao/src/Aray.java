
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class Aray {
    public static void main(String[] args) {
        List<Integer> idades = new ArrayList<>();
        idades.add(17);
        idades.add(18);
        idades.add(19);
        idades.add(20);
        idades.add(22);

        System.out.println(idades);
        System.out.println(idades.contains(258848)); //verdadeiro ou falso
        System.out.println(idades.indexOf(1575258));
        System.out.println(idades.size());

        System.out.println(idades.getLast());

        Collections.sort(idades); // se depois desse pega o ultimo o resultado vai ser diferente pq ele ordenou a lista

    }
}
