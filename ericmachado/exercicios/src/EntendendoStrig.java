public class EntendendoStrig {
    public static void main(String[] args) throws Exception {
       
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

    String s2 = "Algum texto para validar o uso strings";
    System.out.println(s2.contains( "validar"));

    String s3 = "Algum texto para validar o uso Strings";
    s3 = s3.trim();
    System.out.println(s3);

    String s4 = "Java123";
    System.out.println(s4.trim().length());
    System.out.println(s3.length());
    System.out.println(s2.length());

    System.out.println(s3.toUpperCase());
    System.out.println(s3.toUpperCase());
    System.out.println(s4.toUpperCase());

    System.out.println(s3.toLowerCase());

    String s6 = "Universidade";

    s.substring(7);
    System.out.println(s6);

    s.substring(5);
    System.out.println(s6);


}
}
