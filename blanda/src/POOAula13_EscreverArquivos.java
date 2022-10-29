import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class POOAula13_EscreverArquivos {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String caminhoDoArquivo = "C:/tmp/";
        String nomeArquivo = "arquivo.txt";
        String conteudo = "";

        BufferedWriter bufWrite = new BufferedWriter(new FileWriter(caminhoDoArquivo+ nomeArquivo));

        System.out.println("Escreva algo: ");
        conteudo = entrada.nextLine();
        bufWrite.append(conteudo);
bufWrite.close();

       

    }
}