import java.util.Iterator;
import java.util.LinkedHashSet;

public class Principal {
    public static void main(String[] args) {
        LinkedHashSet<Integer> seqNumerica = new LinkedHashSet<>();
        seqNumerica.add(1);
        seqNumerica.add(2);
        seqNumerica.add(4);
        seqNumerica.add(8);
        seqNumerica.add(16);
        System.out.println(seqNumerica);
        seqNumerica.remove(4);
        System.out.println(seqNumerica);
        System.out.println(seqNumerica.size());

        Iterator<Integer> iterator =seqNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Integer numero:seqNumerica){
            System.out.println(numero);
        }
        System.out.println(seqNumerica.isEmpty());
        seqNumerica.clear();
        System.out.println(seqNumerica.isEmpty());
    }
}
