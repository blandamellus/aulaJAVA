import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class POO_Aula13_EscreverArquivos {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        String caminhoDoArquivo = "C:/Users/cprog/Desktop/Valentina/aulaJAVA/valentina/exercicios/";
        String conteudo = "";
        String nomeArquivo = "arquivo.txt";


        BufferedWriter bufWrite = new BufferedWriter(new FileWriter(caminhoDoArquivo+nomeArquivo));

        System.out.println("Escreva algo: ");
        conteudo = entrada.nextLine();
        bufWrite.append(conteudo);
        bufWrite.close();

        // lendo um arquivo

        BufferedReader leitor = new BufferedReader(new FileReader(caminhoDoArquivo + nomeArquivo));
        String conteudoLido = "";

        while (true) {
            if(conteudoLido != null){
                System.out.println(conteudoLido);
            } else {
                break;
            }
            conteudoLido = leitor.readLine();
        }
        leitor.close();



    }
}