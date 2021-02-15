package Fila;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue <String> filaBanco= new LinkedList<>();
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pâmela");
        filaBanco.add("Anderson");
        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);
        filaBanco.clear();
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);
        String clientePrimeiroErro = filaBanco.element();
        System.out.println(clientePrimeiroErro);

    }
}
