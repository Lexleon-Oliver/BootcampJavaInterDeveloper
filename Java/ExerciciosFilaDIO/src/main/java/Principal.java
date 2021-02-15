import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Principal {
    public static void main(String[] args) {
        Queue <String> filaExerc = new LinkedList<>();
        filaExerc.add("Juliana");
        filaExerc.add("Pedro");
        filaExerc.add("Carlos");
        filaExerc.add("Larissa");
        filaExerc.add("Joao");

        for (String cliente: filaExerc){
            System.out.println(cliente);
        }

        String primeiroCliente = filaExerc.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaExerc);
        String primeiroRemovido = filaExerc.poll();
        System.out.println(primeiroRemovido);
        System.out.println(filaExerc);
        filaExerc.add("Daniel");
        System.out.println(filaExerc);
        int tamanho = filaExerc.size();
        System.out.println(tamanho);
        boolean vazio =filaExerc.isEmpty();
        System.out.println(vazio);
        boolean temCarlos = filaExerc.contains("Carlos");
        System.out.println(temCarlos);
    }



}
