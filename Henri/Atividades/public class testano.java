public class testano{
    public static void main(String[] args) {

        String ex1 = "criando minha própria collection";
        String ex2 = "E aprendendo como funciona listas!";
        String ex3 = "Usar vetores dá muito trabalho";

        ArrayList<String> lista = new ArrayList<>(){};
        lista.add(ex1);
        lista.add(ex2);
        lista.add(ex3);

        System.out.println(lista);
    //remover coisas da lista

        list.remove(0);
        System.out.println(lista);
    //iterar uma collection
        for (String list : lista) {
            System.out.println("valor individual de cada volta FOR" + lis);
        }

        //vetor[posição]
        System.out.println(lista.get(0));

        for (int i = 0, i < lista.size() ; i++) {
            System.out.println("Item da lista" + lista.get(i));
        }
    }
}