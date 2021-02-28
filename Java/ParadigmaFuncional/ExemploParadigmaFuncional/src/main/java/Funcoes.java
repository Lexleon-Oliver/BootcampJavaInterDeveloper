import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String,String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,Integer> converterStringParaInteiroECalcularODobro = string->Integer.valueOf(string)*2;
        System.out.println(retornaNomeAoContrario.apply("ALEX OLIVEIRA"));
        System.out.println(converterStringParaInteiroECalcularODobro.apply("20"));
    }
}
