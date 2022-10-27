package Array;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class EscrevendoArquivos {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String caminhoDoArquivo = "C:/Users/cprog/Desktop/othavio/aulaJAVA/othavio/exercicios/src/tmp";
        String conteudo = "";
        String nomeArquivo = "arquivo.txt";

        BufferedWriter bufwrite = new BufferedWriter(new FileWriter(caminhoDoArquivo+ nomeArquivo));

        System.out.println("Escreva algo: ");
        conteudo = entrada.nextLine();
        bufwrite.append(conteudo);
        bufwrite.close();
    }
    
}
