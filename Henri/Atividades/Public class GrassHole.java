import java.io.BufferedWriter;
import java.io.FileWriter;

Public class GrassHole {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String CaminhoDoAarquivo = "C: \\Users\cprog\Desktop";
        String conteudo = " ";
        String nomeArquivo = "arquivo.txt";

        BufferedWriter bufWrite = new BufferedWriter(new FileWriter(CaminhoDoAarquivo + "arquivo.txt"));

        System.out.println("escreva algo: ");
        conteudo = entrada.nextLine();
        bufWrite.append(conteudo);
        bufWrite.close();

        BufferedWriter leitor = new BufferedWriter(new FileWriter(CaminhoDoAarquivo + nomeArquivo));

        String conteudoLido = " ";

        while (true){
            if(conteudo != null){ //null = vazio
                System.out.println(conteudo);
            } else {
                break;
            }

            conteudoLido = leitor.readLine();
        }
        leitor.close();
    }
}