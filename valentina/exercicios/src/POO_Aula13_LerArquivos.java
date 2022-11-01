import java.io.BufferedReader;
import java.io.FileReader;

public class POO_Aula13_LerArquivos {
    public static void main(String[] args) throws Exception {


        String caminhoDoArquivo = "C:/Users/cprog/Desktop/Valentina/aulaJAVA/valentina/exercicios/";
        String conteudo = "";
        String nomeArquivo = "arquivo.txt";

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