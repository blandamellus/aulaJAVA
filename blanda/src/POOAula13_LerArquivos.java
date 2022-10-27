import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class POOAula13_LerArquivos {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String caminhoDoArquivo = "C:/tmp/";
        String nomeArquivo = "arquivo.txt";
        
        // lendo um arquivo
        BufferedReader leitor = new BufferedReader(new FileReader(caminhoDoArquivo + nomeArquivo));

        String conteudoLido = "";
        while (true) {
            if(conteudoLido != null){ // null = vazio
                System.out.println(conteudoLido);
            } else {
                break;
            }
            conteudoLido = leitor.readLine();
        }
        leitor.close();

    }
}