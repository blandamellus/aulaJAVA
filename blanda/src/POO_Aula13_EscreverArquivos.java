import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.FileWriter;


public class POO_Aula13_EscreverArquivos {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        String path = "C:/tmp/file.txt";

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		
		System.out.println("Escreva algo para salvarmos: ");
		linha = input.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();

        
    }
}