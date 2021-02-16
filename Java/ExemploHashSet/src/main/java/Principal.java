import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Set<Double> notaAlunos = new HashSet<>();
        notaAlunos.add(5.8);
        notaAlunos.add(9.3);
        notaAlunos.add(6.5);
        notaAlunos.add(10.0);
        notaAlunos.add(5.4);
        notaAlunos.add(7.3);
        notaAlunos.add(3.8);
        notaAlunos.add(4.0);
        System.out.println(notaAlunos);
        notaAlunos.remove(3.8);
        System.out.println(notaAlunos);
        System.out.println(notaAlunos.size());
        Iterator<Double> iterator = notaAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Double nota:notaAlunos){
            System.out.println(nota);
        }
        //notaAlunos.clear();
        System.out.println(notaAlunos.isEmpty());

        notaAlunos.add(10.0);
        System.out.println(notaAlunos);
    }
}
