import java.util.ArrayList;

// Collections JAva

public class POO_Aula013_Lists {

	public static void main(String[] args) {
        String [] vetor = new String[5];
        
        ArrayList<String> lista = new ArrayList<>();
        
        vetor[0] = "Alguma informação no meu vetor!";
        lista.add("Alguma informação na minha lista!");


        System.out.println(lista);
        System.out.println(vetor);

    }
}