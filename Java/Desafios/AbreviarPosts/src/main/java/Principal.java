import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Principal {

    public static void main(String[] args) throws IOException {
        ArrayList<String> alfabeto = new ArrayList(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        HashMap<String,Integer> palavrasQueAparecem =new HashMap<>();
        HashMap<String,String> melhoresPalavras =new HashMap<>();
        int economiaDeLetra=0;
        ArrayList<String> frase= new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String novaLinha;
        String palavra;
        String palavraJaExistente;
        int i=0;
        while (!".".equals((novaLinha = br.readLine()))) {//1- Ler até encontrar um ponto
            StringTokenizer st = new StringTokenizer(novaLinha);
            while(st.hasMoreTokens()){
                palavra=st.nextToken();
                if(palavrasQueAparecem.get(palavra)==null){
                    i=0;
                }else{
                    i=palavrasQueAparecem.get(palavra);
                }
                i++;
                frase.add(palavra);
                palavrasQueAparecem.put(palavra,i);//Adiciona todas as palavras que aparecem


            }
            Set<String> chaves = palavrasQueAparecem.keySet();

            for (String chave : chaves)
            {//percorre o vetor para encontrar as melhores palavras
                economiaDeLetra=0;
                if(chave != null) {

                    economiaDeLetra=(chave.length()-2)*palavrasQueAparecem.get(chave);
                    //   System.out.printf(chave+" Economia: %d\n",economiaDeLetra);
                    if(economiaDeLetra>0){
                        if(!melhoresPalavras.containsKey(chave.substring(0,1))) {
                            melhoresPalavras.put(chave.substring(0,1), chave);
                        }else{
                            palavraJaExistente=melhoresPalavras.get(chave.substring(0,1));//Pega a palavra que ja existe com essa letra
                            if(economiaDeLetra>((palavraJaExistente.length()-2)*palavrasQueAparecem.get(palavraJaExistente))){
                                //  System.out.println(chave+">"+palavraJaExistente);
                                melhoresPalavras.put(chave.substring(0,1), chave);
                            }else{
                                // System.out.println(palavraJaExistente+">"+chave);
                            }

                        }
                    }
                }

            }


            for(int j=0;j<frase.size();j++){//Saida 1
                String palavraAtual=frase.get(j);

                if(!melhoresPalavras.containsValue(frase.get(j))){
                    System.out.print(palavraAtual+" ");

                }else{
                    System.out.print(palavraAtual.substring(0,1)+". ");
                }
            }
            System.out.println();
            System.out.println(melhoresPalavras.size());//saida 2
            //  System.out.println(melhoresPalavras);
            ArrayList<String> listaOrdenada=new ArrayList<>();

            for (String letra : alfabeto) {//percorre o vetor para ordenar em uma nova lista
                economiaDeLetra = 0;
                if ((letra != null)&&(melhoresPalavras.containsKey(letra))) {
                    System.out.println(letra+". = "+melhoresPalavras.get(letra));

                }
            }


            // System.out.println(listaOrdenada);
            palavrasQueAparecem =new HashMap<>();
            melhoresPalavras =new HashMap<>();
            frase= new ArrayList<>();

        }//Encontrou um ponto/FIM
    }

}


