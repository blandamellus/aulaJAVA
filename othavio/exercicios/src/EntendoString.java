public class EntendoString {
    public static void main(String[] args) throws Exception {
        int numero;
        int numero1 = 0;

        String minhaString = new String();
        minhaString = "alguma coisa";

        String minhaString2 = "alguma coisa2";

        String minhaString3 = new String("alguma coisa");

        System.out.println(minhaString);
        System.out.println(minhaString2);
        System.out.println(minhaString3); 

        // Substituindo Strings
        String S = "alguma coisa";
        System.out.println(S);
        S = S.replace("coisa", "porra");
        System.out.println(S);

        String s2 = "Algum texto para validar o uso strings";
        System.out.println(s2.contains("Algum"));

        String s3 = " meu texto de teste aqui ";
        s3 = s3.trim();
        System.out.println(s3);

        String s4 = " Java 123 ";
        System.out.println(s4.trim().length());
        System.out.println(s3.length());
        System.out.println(s2.length());

        System.out.println(s4.toUpperCase());
        System.out.println(s3.toUpperCase());
        System.out.println(s2.toLowerCase());

        String s6 = "Universidade";
        
        s6 = s6.substring(7);
        System.out.println(s6);

        s6 = s6.substring(5);
        System.out.println(s6);

        







    }
} 