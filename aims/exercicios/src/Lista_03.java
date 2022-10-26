import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner; 

public class Lista_03{
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner (System.in);

        String caminhoDoArquivo = "C:/Users/cprog/Desktop/aims/aulaJAVA/aims/exercicios/src/tmp/";
        String nomeArquivo = "arquivo.txt";
        String conteudo = "";

        BufferedWriter bufWrite = new BufferedWriter (new FileWriter (caminhoDoArquivo + nomeArquivo));

        System.out.println("escreva algo:");
        conteudo = entrada.nextLine();
        bufWrite.append(conteudo);
        bufWrite.close();
        
    //lendo um arquivo

        BufferedReader leitor = new BufferedReader (new FileReader (caminhoDoArquivo + nomeArquivo));
        String conteudoLido = "";

        while (true){
            if (conteudo != null){
                System.out.println (conteudo);
            }else{
                break;
            }
            conteudo = leitor.readLine();
          }
          
    }
}

