import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class POOAula13_EscreverArquivos{
    public static void main(String[] args)  throws Exception{
      Scanner entrada = new Scanner(System.in);
        
        String caminhoDoArquivo = "C:/Users/cprog/Desktop/Maiara Pimentel/aulaJAVA/maiarapimentel/exercicios/src/tmp/";
        String nomeArquivo = "Arquivo.txt";
        String conteudo = "";

        BufferedWriter bufWrite = new BufferedWriter(new FileWriter(caminhoDoArquivo + nomeArquivo));

        System.out.println("Escreva algo");
        conteudo = entrada.nextLine();
        bufWrite.append(conteudo);
        bufWrite.close();

        //lendo um arquivo
        BufferedReader leitor = new BufferedReader(new FileReader(caminhoDoArquivo + nomeArquivo));

        String conteudoLido = "";

        while (true){
            if(conteudoLido != null){ //null = vazio
                System.out.println(conteudoLido);
            } else{
                break;
            }

            conteudoLido = leitor.readLine();
        }
        leitor.close();

    }
}