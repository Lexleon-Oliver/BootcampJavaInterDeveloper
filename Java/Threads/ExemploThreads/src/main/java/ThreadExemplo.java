public class ThreadExemplo {
    public static void main(String[] args) {
        GeradorPDF iniciarGeradorPDF = new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPDF);

        iniciarGeradorPDF.start();
        iniciarBarraDeCarregamento.start();
    }
}

class GeradorPDF extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("Gerando PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Gerado!");
    }
}

class BarraDeCarregamento extends Thread{
    private Thread iniciarGeradorPDF;

    public BarraDeCarregamento(Thread iniciarGeradorPDF) {
        this.iniciarGeradorPDF = iniciarGeradorPDF;
    }

    @Override
    public void run(){
        try {
            while (true){
                Thread.sleep(500);
                if (!iniciarGeradorPDF.isAlive()){
                    break;
                }
                System.out.println("Loading ...");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

/*class BarraDeCarregamento2 implements Runnable{
    @Override
    public void run(){

        try {
            Thread.sleep(3000);
            System.out.println("Rodei Barra de Carregamento 2 : ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BarraDeCarregamento3 implements Runnable{
    @Override
    public void run(){

        try {
            Thread.sleep(1000);
            System.out.println("Rodei Barra de Carregamento 3 : ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}*/
