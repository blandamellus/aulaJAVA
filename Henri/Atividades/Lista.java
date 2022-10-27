import java.util.ArrayList;
public class lista {
    public static void main(String[] args) {

        String ex1 = "Garen tank Não funciona";
        String ex2 = "Zilean mid é maluquice";
        String ex3 = "Jax AP é underratted!!!";

    ArrayList<String> lista = new ArrayList<>(){};
        lista.add(ex1);
        lista.add(ex2);
        lista.add(ex3);

        System.out.println(lista);
        //removendo elementos de uma lista
        lista.remove(0);
        System.out.println(lista);
        // iterar uma collection
        for (String lis : lista) {
            System.out.println("Builds do lol: " + lis);
        }
        //posição do vetor

        System.out.println(lista.get(0));

        for (int i = 0; i < lista.size() ; i++) {
        System.out.println("O boneco " + lista.get(i));
        }
    }


}