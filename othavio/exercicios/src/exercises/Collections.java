package exercises;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        String ex1 = "Criando minha primeira collection";
        String ex2 = "E aprendendo como funciona listas!";
        String ex3 = "Usar vetores da muito mais trabalho!!";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(ex1);
        lista.add(ex2);
        lista.add(ex3);

        System.out.println(lista);
        
        //removendo elementos da lista
        lista.remove(0);
        System.out.println(lista);

        //interar uma collection
        for (String lis : lista) {
            System.out.println("Valor individual de cada volta do FOR: " + lis);
        }

        //vetor[posição]
        System.out.println(lista.get(0));

        for (int i = 0; i < lista.size() ; i++) {
            System.out.println("Item da lista: " + lista.get(i));
        }
    }
}
