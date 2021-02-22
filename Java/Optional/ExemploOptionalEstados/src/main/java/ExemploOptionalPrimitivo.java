import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivo {
    public static void main(String[] args) {
        System.out.println("Valor Inteiro Optional");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("Valor DOuble Optional");
        OptionalDouble.of(21.85).ifPresent(System.out::println);

        System.out.println("Valor Long Optional");
        OptionalLong.of(39l).ifPresent(System.out::println);
    }
}
