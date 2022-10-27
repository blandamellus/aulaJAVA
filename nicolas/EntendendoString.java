public class EntendendoString {
    public static void main(String[] args) throws Exception {
      int numero;
      int numero1 = 0;
      
      String minhaString = new String();
      minhaString = "alguma coisa";

      String minhaString2 = "alguma coisa2";

      String minhaString3 = new String ( "alguma coisa3");

      System.out.println(minhaString);
      System.out.println(minhaString2);
      System.out.println(minhaString3);

      //Substituindo strings

      String s = "algum texto";
      System.out.println(s);
      s = s.replace("texto", "novo texto");
      System.out.println(s);
     
      //verifica dentro da variavel a expressão que estou procurando
      String s2 = "algum texto para validar o uso Strings";
      System.out.println(s2.contains("validar"));

      //remove espaços do inicio e sim da variavel(String)
      String s3 = "a meu texto de teste aqui b";
      s3 = s3.trim();
      System.out.println(s3);

    //calcula o tamanho da String contando caracteres
      String s4 = " java ";
      System.out.println(s4.trim().length());
      System.out.println(s3.length());
      System.out.println(s2.length());

      //tranforma as letras
      System.out.println(s3.toUpperCase());
      System.out.println(s2.toUpperCase());

      //
      System.out.println(s3.toLowerCase());

      String s6 ="universidade";
      s6 = s6.substring(7);
      System.out.println(s6);

      s6 = s6.substring(5);
      System.out.println(s6);
    }
    
}
