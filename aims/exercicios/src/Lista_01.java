public class Lista_01 {
    public static void main(String[] args){
        String [] vetor = new String[5];

        ArrayList<String> lista = new ArrayList<>();
        vetor[0] = "alguma informação ao meu vetor";
        lista.add("alguma informação na minha lista");
        
        System.out.println(lista);
        System.out.println(vetor);
    }
}

