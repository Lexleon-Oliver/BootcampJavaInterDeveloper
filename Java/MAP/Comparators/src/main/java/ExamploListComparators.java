import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExamploListComparators {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
            estudantes.add(new Estudante("Carlos", 23));
            estudantes.add(new Estudante("Pedro",19));
            estudantes.add(new Estudante("Mariana",21));
            estudantes.add(new Estudante("João",18));
            estudantes.add(new Estudante("Thiago", 20));
            estudantes.add(new Estudante("George", 22));
            estudantes.add(new Estudante("Larissa",21));

        System.out.println("----Ordem de Inserção----");
        System.out.println(estudantes);

        estudantes.sort((first,second)-> first.getIdade()- second.getIdade());
        System.out.println("----Ordem por Idade----");
        System.out.println(estudantes);

        estudantes.sort((first,second)-> second.getIdade() - first.getIdade());
        System.out.println("----Ordem Reversa por Idade");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("----Ordem por Idade (Method Reference)----");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("----Ordem Reversa por Idade (Method Reference)----");
        System.out.println(estudantes);

        Collections.sort(estudantes);
        System.out.println("----Ordem por Idade (Interface Comparable)----");
        System.out.println(estudantes);

        Collections.sort(estudantes,new EstudanteOrdemReversaIdadeComparator());
        System.out.println("----Ordem Reversa por Idade (Interface Comparator)----");
        System.out.println(estudantes);

    }
}
