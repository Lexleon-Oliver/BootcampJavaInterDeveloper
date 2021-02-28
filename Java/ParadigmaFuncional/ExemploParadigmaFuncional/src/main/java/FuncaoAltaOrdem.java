public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a,b) -> a+b;
        Calculo subtracao = (a,b) -> a-b;
        Calculo multiplicacao = (a,b) -> a*b;
        Calculo divisao = (a,b) -> a/b;

        System.out.println(executarOperacao(soma,1,3));
        System.out.println(executarOperacao(subtracao,4,4));
        System.out.println(executarOperacao(multiplicacao,5,5));
        System.out.println(executarOperacao(divisao,12,6));

    }

    public static int executarOperacao(Calculo calculo,int a,int b){
        return calculo.calcular(a,b);
    }
}

interface Calculo{
    public int calcular(int a, int b);
}