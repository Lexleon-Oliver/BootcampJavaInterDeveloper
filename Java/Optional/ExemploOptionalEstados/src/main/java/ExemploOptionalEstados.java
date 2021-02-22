import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor Presente");
        System.out.println("Valor Opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println,()-> System.out.println("Não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor Opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println,()-> System.out.println("Null = Não está presente"));

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println("Valor Opcional que não está presente");
        optionalEmpty.ifPresentOrElse(System.out::println,()-> System.out.println("Empty = Não está presente"));

        Optional<String> optionalNullErro =Optional.of(null);
        System.out.println("Valor Opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println,()-> System.out.println("Erro = Não está presente"));
    }
}
