import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<String> estaVazio = String::isEmpty;

        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Alex"));
    }
}
