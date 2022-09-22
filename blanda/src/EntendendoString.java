public class EntendendoString {
    public static void main(String[] args) throws Exception {
        int numero;
        int numero1 = 0;

        String minhaString = new String();
        minhaString = "alguma coisa";

        String minhaString2 = "alguma coisa2";

        String minhaString3 = new String("alguma coisa3");

        System.out.println(minhaString);
        System.out.println(minhaString2);
        System.out.println(minhaString3);

        // Substituindo strings
        String s = "Algum texto";
        System.out.println(s);
        s = s.replace("texto", "novo texto");
        System.out.println(s);
        
        // verifica dentro da variável a expressão que estou procurando
        String s2 = "Algum texto para validar o uso strings";
        System.out.println(s2.contains("validar"));

        // remove espaços do inicio e fim da variavel(string)
        String s3 = "a meu texto de teste aqui b";
        s3 = s3.trim();
        System.out.println(s3);
        
        // calcula o tamanho da string contando caracteres
        String s4 = " Java 123 ";
        System.out.println(s4.trim().length());
        System.out.println(s3.length());
        System.out.println(s2.length());
        
        // transformando as letras em maiúsculo
        System.out.println(s3.toUpperCase());
        System.out.println(s4.toUpperCase());

        // transformando as letras em minusculas
        System.out.println(s3.toLowerCase());

        String s6 = "Universidade";
        // subtrai os caracteres de 0 até o indice informado [7]
        s6 = s6.substring(7);
        System.out.println(s6);

        // subtrai os caracteres de 0 até o indice informado [5]
        s6 = s6.substring(5);
        System.out.println(s6);
       


    }
}