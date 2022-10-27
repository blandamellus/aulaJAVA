import java.util.ArrayList;

// Collections JAva

public class POO_Aula012_ArrayList {

	public static void main(String[] args) {
        //  List -> ArrayList

        String ex1 = "Criando minha primeira Collection";
        String ex2 = "E aprendendo como funciona listas!";
        String ex3 = "Usar vetores dá muito mais trabalho!!!";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(ex1);
        lista.add(ex2);
        lista.add(ex3);
        
        System.out.println(lista);

        // removendo elementos de uma lista
        lista.remove(0);
        System.out.println(lista);

        // iterar uma collection
        for (String lis : lista) {
            System.out.println("Valor individual de cada volta do FOR: " + lis);
        }
        
        System.out.println(lista.get(0));

        for (int i = 0; i < lista.size() ; i++) {
            System.out.println("Item da Lista: " + lista.get(i));   
        }

    }
}