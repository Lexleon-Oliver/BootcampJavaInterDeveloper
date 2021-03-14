import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class ExemploCasa {
    private static final ExecutorService threadPool = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());
        List<Future<String>> futuros =
                new CopyOnWriteArrayList<>(casa.obterAFazeresDaCasa().stream()
                .map(atividade -> threadPool.submit(()-> {

                    try {
                        return atividade.realizar();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return null;
                })

                )
                .collect(Collectors.toList()));



        while(true){
            int numeroDeAtividadesNaoFinalizadas =0;
            for (Future<?> futuro : futuros){
                if (futuro.isDone()){
                    try {
                        System.out.println("Parabéns voce terminou de "+futuro.get());
                        futuros.remove(futuro);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                } else{
                    numeroDeAtividadesNaoFinalizadas++;
                }
            }
            if (futuros.stream().allMatch(Future::isDone)){
                break;
            }

            System.out.println("Número de Atividades Não finalizadas: "+numeroDeAtividadesNaoFinalizadas);
            Thread.sleep(500);
        }
        threadPool.shutdown();
    }
}

class Casa{
    private List<Comodo> comodos;
    Casa(Comodo... comodos) {this.comodos = Arrays.asList(comodos);}

    List<Atividade> obterAFazeresDaCasa(){
        return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<Atividade>(), (pivo,atividades)-> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }
}

interface Atividade{
    String realizar() throws InterruptedException;
}

abstract class Comodo{
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo{
    @Override
    List<Atividade> obterAfazeresDoComodo(){
        return Arrays.asList(
                this::getArrumarACama,
                this::varrerOQuarto,
                this::arrumarGuardaRoupa);


    }

    private String arrumarGuardaRoupa() throws InterruptedException {
        Thread.sleep(5000);
        String guardaRoupa = "Arrumar o Guarda Roupa";
        System.out.println("Arrumar o Guarda Roupa");
        return guardaRoupa;
    }

    private String varrerOQuarto() throws InterruptedException {
        Thread.sleep(7000);
        String quarto = "Varrer o Quarto";
        System.out.println("Varrer o Quarto");
        return quarto;
    }

    private String getArrumarACama() throws InterruptedException {
        Thread.sleep(10000);
        String cama = "Arrumar a Cama";
        System.out.println("Arrumar a Cama");
        return cama;
    }
}