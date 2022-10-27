import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;


public class POO_Aula13_LerArquivos {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        String path = "C:/tmp/file.txt";

        BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
    }
}