import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner; 

public class Lista_02{
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
        
    }
}

